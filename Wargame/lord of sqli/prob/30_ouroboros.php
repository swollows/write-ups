// query : select pw from prob_ouroboros where pw=''
<?php
  include "./config.php";
  login_chk();
  $db = dbconnect();
  if(preg_match('/prob|_|\.|rollup|join|@/i', $_GET['pw'])) exit("No Hack ~_~");
  $query = "select pw from prob_ouroboros where pw='{$_GET[pw]}'";
  echo "<hr>query : <strong>{$query}</strong><hr><br>";
  $result = @mysqli_fetch_array(mysqli_query($db,$query));
  if($result['pw']) echo "<h2>Pw : {$result[pw]}</h2>";
  if(($result['pw']) && ($result['pw'] === $_GET['pw'])) solve("ouroboros");
  highlight_file(__FILE__);
?>
