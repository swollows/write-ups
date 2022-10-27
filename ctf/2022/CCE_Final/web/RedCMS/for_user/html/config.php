<?php
	error_reporting(0);

	define('__BASE__', __DIR__);
	define('__TEMPLATE__', __BASE__ . '/templates/');
	define('__MAIN__', true);

	define('__SALT__', '[REDACTED]');
	session_start();
	
	include('./inc/function.php');

	if(!is_file(__BASE__ . '/config/db.config.php')) alert('db.config.php 파일이 없습니다.', 'install/index.php');

	include(__BASE__ . '/config/db.config.php');
	include(__BASE__ . '/inc/db.inc.php');

	if(is_login()){
		if(intval($_SESSION['point']) > 10){
			$_SESSION['level'] = intval($_SESSION['level']) + 1;
			$_SESSION['point'] = 0;

			$query = array(
				'idx' => $_SESSION['idx']				
			);	

			$replace = array(
				'point' => $_SESSION['point'],
				'level' => $_SESSION['level']
			);

			if(!update('user', $replace, $query, 'and')) alert('DB 에러 발생', 'back');
		}
	}

	// global filter
	if(trim($_GET['idx'])){
		if(preg_match('/[^0-9]/', $_GET['idx'])){
			alert('비정상적인 값이 존재 합니다', './index.php');
		}
	}
	if(trim($_GET['level'])){
		if(preg_match('/[^0-9]/', $_GET['level'])){
			alert('비정상적인 값이 존재 합니다', './index.php');
		}	
	}
	if(trim($_GET['p'])){
		if(preg_match('/[^a-zA-Z_]/', $_GET['p'])){
			alert('비정상적인 값이 존재 합니다', './index.php');
		}
	}
	if(trim($_POST['idx'])){
		if(preg_match('/[^0-9]/', $_POST['idx'])){
			alert('비정상적인 값이 존재 합니다', './index.php');
		}
	}
	if(trim($_POST['level'])){
		if(preg_match('/[^0-9]/', $_POST['level'])){
			alert('비정상적인 값이 존재 합니다', './index.php');
		}	
	}
	if(trim($_POST['p'])){
		if(preg_match('/[^a-zA-Z_]/', $_POST['p'])){
			alert('비정상적인 값이 존재 합니다', './index.php');
		}
	}
?>