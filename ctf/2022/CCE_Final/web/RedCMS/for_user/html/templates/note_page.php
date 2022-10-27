<?php
	if(!defined('__MAIN__')) exit('!^_^!');

	include(__TEMPLATE__ . 'head.php');

	$query = array(
		'to_id' => $_SESSION['username']
	);

	$rows = fetch_multi_row('note', $query, '', '0, 15', 'date DESC');	
?>
	<style type="text/css">
		td, th {
			text-align: center;
		}
	</style>
	<div class="container">
		<div class="row">
			<div class="col">
				<table border="1">
					<th style="width:200px">보낸이</th>
					<th style="width:500px">내용</th>
					<th style="width:200px">날짜</th>
					<th style="width:200px">삭제</th>
					<?php for($i=0; $i<count($rows); $i++){
						$content = mb_substr($rows[$i]['content'], 0, 30) . '...';
					 ?>
					<tr>
						<td><?=$rows[$i]['from_id']?></td>
						<td><a href="./note.php?p=read&idx=<?=$rows[$i]['idx']?>"><?=clean_html($content)?></a></td>
						<td><?=$rows[$i]['date']?></td>
						<td><a href="./note.php?p=delete&idx=<?=$rows[$i]['idx']?>">삭제</a></td>
					</tr>
					<?php } ?>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<button type="button" onclick="location.href='./note.php?p=write'" style="margin-top: 10px" class="btn btn-primary">쪽지 전송</button>
			</div>
		</div>
	</div>
	
<?php
	include(__TEMPLATE__ . 'tail.php');
?>

