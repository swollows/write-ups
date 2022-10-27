<?php
	include('./config.php');

	if(is_login()) alert('이미 로그인을 하였습니다', './');

	$require_params = array('username', 'pw');

	if($_POST){
		foreach ($require_params as $key){
			if(!trim($_POST[$key])){
				alert('값이 비었습니다', 'back');
			}

			$$key = trim($_POST[$key]);
		}

		if(!valid_str($username, 'username')){
			alert('값이 올바르지 않습니다', 'back');
		}
		$pw = md5($pw . __SALT__);

		$query = array(
			'username' => $username,
		);
		$id_check = fetch_row('user', $query);
		if(!$id_check) alert('로그인 실패', 'back');

		if($id_check['pw'] !== $pw) alert('로그인 실패', 'back');

		foreach ($id_check as $key => $value) {
			$_SESSION[$key] = $value;
		}

		alert('로그인 성공', './');
		exit;
	}	
	render_page('login');
?>