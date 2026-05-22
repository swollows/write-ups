// query : select id from member where id='' and pw=''
<?php
  include "./config.php";
  login_chk();
  $db = sqlite_open("./db/manticore.db");
  $_GET['id'] = addslashes($_GET['id']);
  $_GET['pw'] = addslashes($_GET['pw']);
  $query = "select id from member where id='{$_GET[id]}' and pw='{$_GET[pw]}'";
  echo "<hr>query : <strong>{$query}</strong><hr><br>";
  $result = sqlite_fetch_array(sqlite_query($db,$query));
  if($result['id'] == "admin") solve("manticore");
  highlight_file(__FILE__);
?>
