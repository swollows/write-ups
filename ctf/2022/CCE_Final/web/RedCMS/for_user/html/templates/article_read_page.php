<?php
	if(!defined('__MAIN__')) exit('!^_^!');

	$idx = $_GET['idx'];
	$row = fetch_row('board', array('idx' => $idx));

	if(!$row) alert('게시글을 찾을 수 없습니다.', './board.php');
	if(intval($row['require_level']) > intval($_SESSION['level'])) alert('권한이 없습니다', 'back');

	include(__TEMPLATE__ . 'head.php');

?>
	<style type="text/css">
		.wrap { margin:auto; text-align:center; margin-top: 50px;}
		.box { vertical-align:middle; display:inline-block; }
		.box .in { width:500px; height:30px; background-color:#FFF; text-align: left;}
	</style>

	<div class="wrap">
		<div class="box">
			<div class="in">
				작성자 : <b><?=clean_html($row['username'])?></b>
				<hr>
				<?=clean_html($row['title'])?>
				<hr>
				<?=str_replace("\n", '<br/>', clean_html($row['content']))?>
				<hr>
				<?php
					if($row['file_path']){
						echo '<a href="./download.php?idx='.$row['idx'].'">Download</a>';
					}
				?>
				<hr>
				<?php 
					if($_SESSION['username'] === $row['username']) echo '<a href="./board.php?p=delete&idx='.$row['idx'].'">삭제</a>';
				?>
			</div>
		</div>
	</div>

<?php
	include(__TEMPLATE__ . 'tail.php');
?>

