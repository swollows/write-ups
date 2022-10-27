<?php
	include('./config.php');

	if(!is_login()) alert('로그인을 먼저 해주세요', 'back');

	session_destroy();
	alert('로그아웃 되었습니다', 'back');
?>