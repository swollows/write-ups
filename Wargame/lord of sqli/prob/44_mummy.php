// query : select
<?php
  include "./config.php";
  login_chk();
  $db = mssql_connect("mummy");
  if(preg_match('/master|sys|information|;|\(|\//i', $_GET['query'])) exit("No Hack ~_~");
  for($i=0;$i<strlen($_GET['query']);$i++) if(ord($_GET['query'][$i]) <= 32) exit("%01~%20 can used as whitespace at mssql");
  $query = "select".$_GET['query'];
  echo "<hr>query : <strong>{$query}</strong><hr><br>";
  $result = sqlsrv_fetch_array(sqlsrv_query($db,$query));
  if($result[0]) echo "<h2>Hello anonymous</h2>";

  $query = "select pw from prob_mummy where id='admin'";
  $result = sqlsrv_fetch_array(sqlsrv_query($db,$query));
  if($result['pw'] === $_GET['pw']) solve("mummy");
  highlight_file(__FILE__);
?>
