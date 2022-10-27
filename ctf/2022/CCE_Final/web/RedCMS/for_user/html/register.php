<?php
	include('./config.php');

	if(is_login()) alert('이미 로그인을 하였습니다', './');

	$require_params = array('username', 'pw', 'email');

	if($_POST){
		foreach ($require_params as $key){
			if(!trim($_POST[$key])){
				alert('값이 비었습니다', 'back');
			}

			$$key = trim($_POST[$key]);
		}

		if(!valid_str($username, 'username') || !valid_str($email, 'email')){
			alert('값이 올바르지 않습니다', 'back');
		}
		$pw = md5($pw . __SALT__);

		$query = array(
			'username' => $username
		);

		$dup_check = fetch_row('user', $query, 'or');
		if($dup_check) alert('이미 데이터가 존재합니다.', 'back');

		$query = array(
			'username' => $username,
			'pw' => $pw,
			'email' => $email,
			'profilebio' => "hi!",
			'level' => '1',
			'point' => '0',
			'is_admin' => '0',
			'is_note' => '1'
		);

		if(!insert('user', $query)){
			alert('회원가입 실패', 'back');
		}

		alert('회원가입 성공', './');
		exit;
	}	
	render_page('register');
?>