<?php
	include('./config.php');
	ob_end_clean();

	if(!trim($_GET['idx'])) alert('파일을 찾을 수 없습니다', 'back');
	
	$query = array(
		'idx' => $_GET['idx']
	);

	$file = fetch_row('board', $query);
	if(!$file) alert('파일을 찾을 수 없습니다', 'back');

	$filepath = $file['file_path'];
	$original = $file['file_name'];

	if(preg_match("/msie/i", $_SERVER['HTTP_USER_AGENT']) && preg_match("/5\.5/", $_SERVER['HTTP_USER_AGENT'])) {
	    header("content-type: doesn/matter");
	    header("content-length: ".filesize($filepath));
	    header("content-disposition: attachment; filename=\"$original\"");
	    header("content-transfer-encoding: binary");
	} else if (preg_match("/Firefox/i", $_SERVER['HTTP_USER_AGENT'])){
	    header("content-type: file/unknown");
	    header("content-length: ".filesize($filepath));
	    header("content-disposition: attachment; filename=\"".basename($file['file_name'])."\"");
	    header("content-description: php generated data");
	} else {
	    header("content-type: file/unknown");
	    header("content-length: ".filesize($filepath));
	    header("content-disposition: attachment; filename=\"$original\"");
	    header("content-description: php generated data");
	}
	header("pragma: no-cache");
	header("expires: 0");
	flush();

	$fp = fopen($filepath, 'rb');

	$download_rate = 10;

	while(!feof($fp)) {
	    print fread($fp, round($download_rate * 1024));
	    flush();
	    usleep(1000);
	}
	fclose ($fp);
	flush();	
?>