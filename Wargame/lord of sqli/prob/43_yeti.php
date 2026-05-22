// query : select id from prob_yeti where id='' and pw=''
<?php
include "./config.php";
login_chk();
$db = mssql_connect("yeti");
if (preg_match('/master|sys|information|;/i', $_GET['id'])) exit("No Hack ~_~");
if (preg_match('/master|sys|information|;/i', $_GET['pw'])) exit("No Hack ~_~");
$query = "select id from prob_yeti where id='{$_GET['id']}' and pw='{$_GET['pw']}'";
echo "<hr>query : <strong>{$query}</strong><hr><br>";
sqlsrv_query($db, $query);

$query = "select pw from prob_yeti where id='admin'";
$result = sqlsrv_fetch_array(sqlsrv_query($db, $query));
if ($result['pw'] === $_GET['pw']) solve("yeti");
highlight_file(__FILE__);
