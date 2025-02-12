from hdwallet import HDWallet
from hdwallet.cryptocurrencies import Ethereum
from hdwallet.symbols import ETH
from hdwallet.mnemonics import BIP39Mnemonic
from hdwallet.derivations import BIP44Derivation, CHANGES

# mnemonic 문구 설정
MNEMONIC_PHRASE: str = "artefact spin dress trust bright scatter cement next zero mixed seed crucial"

# HD Wallet 객체 생성
# from_derivation 함수를 이용하여 BIP44 경로 설정 (이더리움)
# m/44'/60'/0'/0/4294967295
# /44 : 코인 타입 (BIP44Derivation)
# /60 : 이더리움 코인 타입
# /0 : 계정 번호
# /0 : 체인 번호 (0: 외부 체인, 1: 내부 체인)
# /4294967295 : 주소 번호
hdwallet: HDWallet = HDWallet(
    cryptocurrency=Ethereum, 
    symbol=ETH
).from_mnemonic(
    mnemonic=BIP39Mnemonic(
        mnemonic=MNEMONIC_PHRASE
    )
).from_derivation(
    derivation=BIP44Derivation(
        coin_type=60,           # 코인 타입 (60: 이더리움)
        account=0,              # 계정 번호
        change=0,               # 체인 번호 (0: 외부 체인, 1: 내부 체인)
        address=4294967295      # 주소 번호
    )
)

print(f'Mnemonic: {hdwallet.mnemonic()}')
print(f'Base HD Path: {hdwallet.path()}')
print(f'Private Key: {hdwallet.private_key()}')
print(f'Ethereum Address: {hdwallet.address()}')