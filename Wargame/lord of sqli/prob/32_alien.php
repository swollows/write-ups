// query : select id from prob_alien where no=
<?php
  include "./config.php";
  login_chk();
  $db = dbconnect();
  if(preg_match('/admin|and|or|if|coalesce|case|_|\.|prob|time/i', $_GET['no'])) exit("No Hack ~_~");
  $query = "select id from prob_alien where no={$_GET[no]}";
  echo "<hr>query : <strong>{$query}</strong><hr><br>";
  $query2 = "select id from prob_alien where no='{$_GET[no]}'";
  echo "<hr>query2 : <strong>{$query2}</strong><hr><br>";
  if($_GET['no']){
    $r = mysqli_fetch_array(mysqli_query($db,$query));
    if($r['id'] !== "admin") exit("sandbox1");
    $r = mysqli_fetch_array(mysqli_query($db,$query));
    if($r['id'] === "admin") exit("sandbox2");
    $r = mysqli_fetch_array(mysqli_query($db,$query2));
    if($r['id'] === "admin") exit("sandbox");
    $r = mysqli_fetch_array(mysqli_query($db,$query2));
    if($r['id'] === "admin") solve("alien");
  }
  highlight_file(__FILE__);
?>
