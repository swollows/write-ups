// query : select * from prob_revenant where id='' and pw=''
<?php
include "./config.php";
login_chk();
$db = mssql_connect("revenant");
if (preg_match('/master|sys|information|prob|;|waitfor|_/i', $_GET['id'])) exit("No Hack ~_~");
if (preg_match('/master|sys|information|prob|;|waitfor|_/i', $_GET['pw'])) exit("No Hack ~_~");
$query = "select * from prob_revenant where id='{$_GET['id']}' and pw='{$_GET['pw']}'";
echo "<hr>query : <strong>{$query}</strong><hr><br>";
sqlsrv_query($db, $query);
if (sqlsrv_errors()) exit(mssql_error(sqlsrv_errors()));

$query = "select * from prob_revenant where id='admin'";
$result = sqlsrv_fetch_array(sqlsrv_query($db, $query));
if ($result['4'] === $_GET['pw']) solve("revenant"); // you have to pwn 5th column
highlight_file(__FILE__);
