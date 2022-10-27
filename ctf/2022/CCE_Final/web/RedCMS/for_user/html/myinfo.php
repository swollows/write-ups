<?php
	include('./config.php');

	if(!is_login()) alert('로그인 권한이 필요합니다', './login.php');

	if (!isset($_GET['call_temp_config'])) {
		if(file_exists('/tmp/cache/config_cache_'.$_SESSION['username'])) {
			die("<script>if(prompt('임시저장된 설정이 있습니다. 반영하시겠습니까?')==='y') {location.href='?call_temp_config=1';} else { location.href='?call_temp_config=0';}</script>");
		}
	}

	if(file_exists('/tmp/cache/config_cache_'.$_SESSION['username']) && $_GET['call_temp_config'] === '1') {
		$data = safe_unserialize(base64_decode(file_get_contents('/tmp/cache/config_cache_'.$_SESSION['username'])));
		unlink('/tmp/cache/config_cache_'.$_SESSION['username']);
		if (fetch_row('user', $data, 'and')) {
			alert('이미 반영된 데이터입니다.', './myinfo.php');
		}
		$search = array('idx' => $_SESSION['idx']);
		$replace = array();
		foreach (array('profilebio','pw','is_note') as $k) {
			if(isset($data[$k])) {
				$replace[$k] = $data[$k];
			}
		}
		if(update('user', $replace, $search)){
			foreach (array('profilebio','pw','is_note') as $k) {
				if(isset($replace[$k])) {
					$_SESSION[$k] = $replace[$k];
				}
			}
			alert('변경 되었습니다', './myinfo.php');
		}
		else{
			alert('에러 발생', './myinfo.php');
		}
		exit;
	} else if($_GET['call_temp_config'] === '0') {
		unlink('/tmp/cache/config_cache_'.$_SESSION['username']);
		header("Location: ./myinfo.php");
	}

	if($_POST){
		$replace = array();
		
		if(trim($_POST['pw'])){
			$replace['pw'] = md5($pw . __SALT__);
		}

		if(trim($_POST['profilebio'])) {
			$replace['profilebio'] = trim($_POST['profilebio']);
		}

		if(trim($_POST['note']) === 'enable'){
			$replace['is_note'] = '1';
		}
		else{
			$replace['is_note'] = '0';
		}

		if(trim($_POST['temp_save'] === 'yes')) {
			file_put_contents('/tmp/cache/config_cache_'.$_SESSION['username'], base64_encode(safe_serialize($replace)));
		} else {
			$search = array('idx' => $_SESSION['idx']);
			if(update('user', $replace, $search)){
				foreach (array('profilebio','pw','is_note') as $k) {
					if(isset($replace[$k])) {
						$_SESSION[$k] = $replace[$k];
					}
				}
				alert('변경 되었습니다', './myinfo.php');
			}
			else{
				alert('에러 발생', './myinfo.php');
			}
			exit;
		}
	}

	render_page('myinfo');
?>