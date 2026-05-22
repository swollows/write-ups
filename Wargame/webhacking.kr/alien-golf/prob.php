<?php
  include "../../config.php";
  login_chk();
  $db = dbconnect();
  print_best_golfer(72);
  $db = dbconnect("alien");
  if(preg_match('/admin|if/i', $_GET['no'])) exit("No Hack ~_~");
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
    if($r['id'] === "admin"){
      // !!THIS IS PAYLOAD GOLF CHALLENGE!!
      // My solution of alien golf is 140byte.
      // If your solution is shorter than mine, you will get 5 point per 1 byte.
      $len = 140 - strlen($_GET['no']);
      if($len > 0){
        solve(72,$len * 5);
      }
      else{
        echo "<h2>nice try :)</h2>";
      }
    }
  }
  highlight_file(__FILE__);
?>