// query : select id from prob_nessie where id='' and pw=''
<?php
include "./config.php";
login_chk();
$db = mssql_connect('nessie');
if (preg_match('/master|sys|information|prob|;|waitfor|_/i', $_GET['id'])) exit("No Hack ~_~");
if (preg_match('/master|sys|information|prob|;|waitfor|_/i', $_GET['pw'])) exit("No Hack ~_~");
$query = "select id from prob_nessie where id='{$_GET['id']}' and pw='{$_GET['pw']}'";
echo "<hr>query : <strong>{$query}</strong><hr><br>";
sqlsrv_query($db, $query);
if (sqlsrv_errors()) exit(mssql_error(sqlsrv_errors()));

$query = "select pw from prob_nessie where id='admin'";
$result = sqlsrv_fetch_array(sqlsrv_query($db, $query));
if ($result['pw'] === $_GET['pw']) solve("nessie");
highlight_file(__FILE__);
