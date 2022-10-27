<?php
	if(!defined('__MAIN__')) exit('!^_^!');

	include(__TEMPLATE__ . 'head.php');
?>
	<div class="container">
		<div class="row">
			<div class="col">
				<form method="POST" action="">
					<div class="form-group">
						<input class="form-control" type="text" name="username" placeholder="아이디를 입력  해주세요.">
					</div>
					<div class="form-group">
						<input class="form-control" type="password" name="pw" placeholder="패스워드를 입력 해주세요">
					</div>
					<div class="form-group" style="margin-top: 10px">
						<button type="submit" class="btn btn-primary">로그인</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
<?php
	include(__TEMPLATE__ . 'tail.php');
?>
