// query : select pw from prob_zombie where pw=''
<?php
  include "./config.php";
  login_chk();
  $db = dbconnect("zombie");
  if(preg_match('/rollup|join|ace|@/i', $_GET['pw'])) exit("No Hack ~_~");
  $query = "select pw from prob_zombie where pw='{$_GET[pw]}'";
  echo "<hr>query : <strong>{$query}</strong><hr><br>";
  $result = @mysqli_fetch_array(mysqli_query($db,$query));
  if($result['pw']) echo "<h2>Pw : {$result[pw]}</h2>";
  if(($result['pw']) && ($result['pw'] === $_GET['pw'])) solve("zombie");
  highlight_file(__FILE__);
?>
