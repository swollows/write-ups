// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

contract DreamIdle {
    uint256 constant LEVEL_MAX_EXP_CAP = 1e64;
    uint256 constant LEVEL_0_EXP = LEVEL_MAX_EXP_CAP / 5;

    struct GameInfo {
        uint256 actionGuage;
        bool actionEnable; // Feed?
        bool initGame;
        GameAction curAction;
    }

    enum GameAction {
        Feed,
        Wash,
        Study,
        Sleep
    }

    struct UserInfo {
        mapping(uint256 => uint256) exp; // User experience points
        mapping(uint256 => uint256) level; // User level
        mapping(address => bool) ng_referral; // Referrer
        mapping(uint256 => GameInfo) games;
        int256 ng_referralBonus; // Referrer bonus
        uint256 expCap; // Experience points required for the current level
    }

    mapping(uint256 => uint256) public levelExpCap;
    mapping(address => UserInfo) public users;
    uint256 public solved;

    constructor() {
        levelExpCap[0] = LEVEL_0_EXP;
        levelExpCap[1] = LEVEL_MAX_EXP_CAP;
        UserInfo storage user = users[msg.sender];
        GameInfo storage game = user.games[0];

        game.actionGuage = 5;
        game.initGame = true;
        game.curAction = GameAction.Feed;
        game.actionEnable = true;

        user.exp[0] = ~uint256(0);
        user.level[0] = 2;
        user.ng_referralBonus = 100;
        user.expCap = levelExpCap[1];
    }

    function initGame(uint256 _gameId) external {
        address sender = msg.sender;
        UserInfo storage user = users[sender];
        GameInfo storage game = user.games[_gameId];
        require(!_existsGame(_gameId), "game already exists");

        game.actionGuage = 5;
        game.initGame = true;

        user.expCap = levelExpCap[0];
        user.ng_referral[sender] = true;
        user.ng_referralBonus = 0;
    }

    function feed(uint256 _gameId) external actionTotalValidation(_gameId) {
        UserInfo storage user = users[msg.sender];
        GameInfo storage game = user.games[_gameId];
        uint256 _userLevel = user.level[_gameId];

        require(!_isActionEnable(_gameId), "only one feed per round");

        game.actionGuage -= 1;
        user.exp[_gameId] += calculateActionExp(_userLevel, GameAction.Feed, 0);
        game.actionEnable = true;
        game.curAction = GameAction.Feed;
    }

    function wash(uint256 _gameId) external actionTotalValidation(_gameId) {
        _isStress(_gameId);
        UserInfo storage user = users[msg.sender];
        GameInfo storage game = user.games[_gameId];
        uint256 _userLevel = user.level[_gameId];

        require(_isActionEnable(0), "Feed action is not done");

        game.actionGuage -= 1;
        uint256 stress = game.curAction == GameAction.Wash ? 1 : 0;
        user.exp[_gameId] += calculateActionExp(_userLevel, GameAction.Wash, stress);
        game.curAction = GameAction.Wash;
    }

    function study(uint256 _gameId) external actionTotalValidation(_gameId) {
        _isStress(_gameId);
        UserInfo storage user = users[msg.sender];
        GameInfo storage game = user.games[_gameId];
        uint256 _userLevel = user.level[_gameId];

        require(_isActionEnable(0), "Feed action is not done");

        game.actionGuage -= 1;
        uint256 stress = game.curAction == GameAction.Study ? 1 : 0;
        user.exp[_gameId] += calculateActionExp(_userLevel, GameAction.Study, stress);
        game.curAction = GameAction.Study;
    }

    function sleep(uint256 _gameId) external actionTotalValidation(_gameId) {
        UserInfo storage user = users[msg.sender];
        GameInfo storage game = user.games[_gameId];
        uint256 _userLevel = user.level[_gameId];

        require(game.curAction != GameAction.Sleep, "sleep?");
        require(_isActionEnable(0), "Feed action is not done");

        user.exp[_gameId] += calculateActionExp(_userLevel, GameAction.Sleep, 0);
        game.actionEnable = false; // sleep action is last action
        game.curAction = GameAction.Sleep;
        game.actionGuage = 5; // reset action guage
    }

    function addNGReferral(address _referral) external {
        UserInfo storage user = users[msg.sender];
        require(!user.ng_referral[_referral], "already referral");
        uint256 _activeUser = _isEligible(_referral);
        int256 _rb;
        assembly {
            if extcodesize(_referral) { revert(0, 0) }
            switch _activeUser
            case 0 { _rb := sub(0, 1) }
            default { _rb := add(0, 1) }
        }
        user.ng_referralBonus += _rb;
    }

    function levelUp(uint256 _gameId) external {
        UserInfo storage user = users[msg.sender];
        uint256 _userLevel = user.level[_gameId];
        _isMaxLevel(_userLevel);
        uint256 _userExp = user.exp[_gameId];
        uint256 _userExpCap = user.expCap;

        require(_userExp >= _userExpCap, "not enough exp");

        user.level[_gameId] += 1;
        user.exp[_gameId] = _userExp - _userExpCap;
        user.expCap = _getLevelExpCap(_userLevel + 1);
    }

    function solve(uint256 _gameId) external payable {
        uint256 _userLevel = getUserLevel((tx.origin), _gameId);
        require(_userLevel == 2, "not max level");
        require(msg.value >= 1e18, "mint price is 1 eth");
        solved = 1;
    }

    function calculateActionExp(uint256 _userLevel, GameAction _action, uint256 _stress)
        public
        view
        returns (uint256)
    {
        uint256 _level = _getLevelExpCap(_userLevel);
        uint256 _actionExp;
        uint256 _ng_referralBonus = uint256(users[msg.sender].ng_referralBonus);

        if (_action == GameAction.Feed) {
            _actionExp = _level * (5 - _stress) / 10000;
        } else if (_action == GameAction.Wash) {
            _actionExp = _level * (10 - _stress) / 10000;
        } else if (_action == GameAction.Study) {
            _actionExp = _level * (20 - _stress) / 10000;
        } else if (_action == GameAction.Sleep) {
            _actionExp = _level * (30 - _stress) / 10000;
        } else {
            revert("invalid action");
        }
        uint256 bonusExp;
        uint256 _value;
        {
            if (_ng_referralBonus >= 1e6) {
                bonusExp = _ng_referralBonus / 1e6;
            } else {
                bonusExp = _actionExp * (_ng_referralBonus) / 10000;
            }
            _value = _actionExp + bonusExp;
        }
        return _value;
    }
    // getter

    function getUserLevel(address _user, uint256 _gameId) public view returns (uint256) {
        return users[_user].level[_gameId];
    }

    // internal
    function _getLevelExpCap(uint256 _level) internal view returns (uint256) {
        return levelExpCap[_level];
    }

    function _isStress(uint256 _gameId) internal view {
        require(users[msg.sender].games[_gameId].actionGuage > 1, "You are stressed, please sleep");
    }

    function _isEligible(address _user) internal view returns (uint256) {
        return payable(_user).balance >= 1e18 ? 0 : 1;
    }

    function _isMaxLevel(uint256 _level) internal pure {
        require(_level < 2, "max level, congrats");
    }

    function _existsGame(uint256 _gameId) internal view returns (bool) {
        return users[msg.sender].games[_gameId].initGame;
    }

    function _isActionEnable(uint256 _gameId) internal view returns (bool) {
        return users[msg.sender].games[_gameId].actionEnable;
    }

    function _isActionGuage(uint256 _gameId) internal view returns (bool) {
        return users[msg.sender].games[_gameId].actionGuage > 0;
    }

    modifier actionTotalValidation(uint256 _gameId) {
        require(_existsGame(_gameId), "game not exists");
        require(_isActionGuage(_gameId), "action guage is not enough");
        _;
    }
}
