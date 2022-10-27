<?php
	include('./config.php');

	if(!is_login()) alert('로그인 권한이 필요합니다', './login.php');

	$page_list = array('write', 'read', 'delete');
	if($_POST){
		$page = trim($_GET['p']);

		if(!in_array($page, $page_list)) alert('에러 발생', './note.php');

		if($page === 'write'){
			$require_params = array('to', 'content');

			foreach ($require_params as $key) {
				if(!trim($_POST[$key])) alert('값이 비었습니다.', 'back');

				$$key = $_POST[$key];
			}

			if(!valid_str($to, 'username')) alert('아이디가 올바르지 않습니다', 'back');

			$find = fetch_row('user', array('username'=>$to));

			if(!$find) alert('받는 사람 아이디를 찾을수 없습니다', 'back');
			if($find['is_note'] !== '1') alert('받는 사람이 쪽지 기능을 비활성화 하였습니다', 'back');

			$insert = array(
				'idx' => time() . rand(),
				'to_id' => $to,
				'from_id' => $_SESSION['username'],
				'content' => $content,
				'date' => now()
			);
			if(!insert('note', $insert)) alert('전송중 에러가 발생 하였습니다', 'back');

			alert('전송 성공', './');
		}
		exit;	
	}

	switch (trim($_GET['p'])) {
		case 'write':
			render_page('note_write');
			break;
		case 'read':
			render_page('note_read');
			break;
		case 'delete':
			if(!trim($_GET['idx'])) alert('쪽지를 찾을 수 없습니다', 'back');

			$query = array(
				'idx' => trim($_GET['idx']),
				'to_id' => $_SESSION['username']
			);

			if(!fetch_row('note', $query, 'and')) alert('쪽지를 찾을 수 없습니다', 'back');
			if(!delete('note', $query, 'and')) alert('삭제 실패', 'back');

			alert('삭제 성공', './note.php');

			break;
		default:
			render_page('note');
			break;
	}
	
?>