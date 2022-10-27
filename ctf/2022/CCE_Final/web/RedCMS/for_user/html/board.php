<?php
	include('./config.php');

	if(!is_login()) alert('로그인 권한이 필요합니다', './login.php');

	if($_POST){
		$page = trim($_GET['p']);
		
		if($page === 'write'){
			
			$insert = array();

			$require_params = array('title', 'content', 'level');
			foreach ($require_params as $key) {
				if(!trim($_POST[$key])) alert('값이 비었습니다.', 'back');

				$$key = $_POST[$key];
			}

			if(mb_strlen($title) > 200 || mb_strlen($content) > 200) alert('값이 너무 깁니다', 'back');
 			if(intval($_SESSION['level']) < intval($level)) alert('자신의 레벨보다 높게 설정 할수 없습니다', 'back');

 			$insert['title'] = $title;
 			$insert['content'] = $content;
 			$insert['username'] = $_SESSION['username'];
			$insert['require_level'] = $level;
			$insert['date'] = now();

			if($_FILES['file']['tmp_name']){
				if($_FILES['file']['size'] > 2097152){
					alert('파일 용량이 너무 큽니다', 'back');
				}
				$file_name = bin2hex(random_bytes(30));

				if(!move_uploaded_file($_FILES['file']['tmp_name'], './upload/' . $file_name)) alert('파일 업로드 실패', 'back');

				$insert['file_path'] = './upload/' . $file_name;
				$insert['file_name'] = $_FILES['file']['name'];
			}

			if(!insert('board', $insert)) alert('게시물 작성 실패', 'back');

			$replace = array('point' => intval($_SESSION['point']) + 1);
			$query   = array('username' => $_SESSION['username']);

			if(!update('user', $replace, $query)) alert('에러 발생', 'back');

			$_SESSION['point'] = intval($_SESSION['point']) + 1;

			alert('게시물 작성 성공', './board.php');
		}
		exit;
	}
	switch (trim($_GET['p'])){
		case 'write':
			render_page('article_write');
			break;
		case 'delete':
			if(!trim($_GET['idx'])) alert('게시글을 찾을 수 없습니다', 'back');

			$query = array(
				'idx' => trim($_GET['idx']),
				'username' => $_SESSION['username']
			);

			if(!fetch_row('board', $query, 'and')) alert('게시글을 찾을 수 없습니다', 'back');
			if(!delete('board', $query, 'and')) alert('삭제 실패', 'back');

			alert('삭제 성공', './note.php');

			break;
		case 'read':
			render_page('article_read');
			break;
		default:
			render_page('board');
			break;
	}
	
?>