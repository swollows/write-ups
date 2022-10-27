<?php
	if(!defined('__MAIN__')) exit('!^_^!');
	include(__TEMPLATE__ . 'head.php');
?>
	<div class="container">
		<div class="row">
			<div class="col">
				<form  action="" method="POST" enctype="multipart/form-data">
					<div class="form-group">
						<input type="text" name="title" class="form-control" placeholder="제목을 입력 해주세요.">
					</div>
					<div class="form-group">
						<textarea  name="content" class="form-control" placeholder="내용을 입력 해주세요." rows="10"></textarea>
					</div>
					<div class="form-group">
						<select name="level" class="form-control" id="exampleFormControlSelect1">
							<option value="1">1 레벨이상</option>
							<option value="2">2 레벨이상</option>
							<option value="3">3 레벨이상</option>
							<option value="4">4 레벨이상</option>
							<option value="5">5 레벨이상</option>
						</select>
					</div>
					<div class="custom-file">
						<input type="file" class="form-control-file" name="file">
					</div>
					<button class="btn btn-primary" type="submit" style="margin-top: 10px">게시글 작성</button>
				</form>
			</div>
		</div>
	</div>
<?php
	include(__TEMPLATE__ . 'tail.php');
?>

