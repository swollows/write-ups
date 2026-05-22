// query : select id from member where id='admin' and pw=''
<?php
  include "./config.php";
  login_chk();
  $db = sqlite_open("./db/poltergeist.db");
  $query = "select id from member where id='admin' and pw='{$_GET[pw]}'";
  echo "<hr>query : <strong>{$query}</strong><hr><br>";
  $result = sqlite_fetch_array(sqlite_query($db,$query));
  if($result['id']) echo "<h2>Hello {$result['id']}</h2>";

  if($poltergeistFlag === $_GET['pw']) solve("poltergeist");// Flag is in `flag_{$hash}` table, not in `member` table. Let's look over whole of the database.
  highlight_file(__FILE__);
?>
