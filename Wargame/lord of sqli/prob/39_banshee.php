// query : select id from member where id='admin' and pw=''
<?php
  include "./config.php";
  login_chk();
  $db = sqlite_open("./db/banshee.db");
  if(preg_match('/sqlite|member|_/i', $_GET[pw])) exit("No Hack ~_~"); 
  $query = "select id from member where id='admin' and pw='{$_GET[pw]}'";
  echo "<hr>query : <strong>{$query}</strong><hr><br>";
  $result = sqlite_fetch_array(sqlite_query($db,$query));
  if($result['id']) echo "<h2>login success!</h2>";

  $query = "select pw from member where id='admin'"; 
  $result = sqlite_fetch_array(sqlite_query($db,$query));
  if($result['pw'] === $_GET['pw']) solve("banshee"); 
  highlight_file(__FILE__);
?>
