// query : select id,pw from prob_frankenstein where id='frankenstein' and pw=''
<?php
  include "./config.php";
  login_chk();
  $db = dbconnect();
  if(preg_match('/prob|_|\.|\(|\)|union/i', $_GET[pw])) exit("No Hack ~_~");
  $query = "select id,pw from prob_frankenstein where id='frankenstein' and pw='{$_GET[pw]}'";
  echo "<hr>query : <strong>{$query}</strong><hr><br>";
  $result = @mysqli_fetch_array(mysqli_query($db,$query));
  if(mysqli_error($db)) exit("error");

  $_GET[pw] = addslashes($_GET[pw]);
  $query = "select pw from prob_frankenstein where id='admin' and pw='{$_GET[pw]}'";
  $result = @mysqli_fetch_array(mysqli_query($db,$query));
  if(($result['pw']) && ($result['pw'] == $_GET['pw'])) solve("frankenstein");
  highlight_file(__FILE__);
?>
