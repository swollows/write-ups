<?php
  include "../../config.php";
  login_chk();
  print_best_golfer(73);
  $db = dbconnect("ouroboros");
  if(preg_match("/\./i", $_GET['pw'])) exit("No Hack ~_~");
  $query = "select pw from prob_ouroboros where pw='{$_GET['pw']}'";
  echo "<hr>query : <strong>{$query}</strong><hr><br>";
  $result = @mysqli_fetch_array(mysqli_query($db,$query));
  if($result['pw']) echo "<h2>Pw : {$result['pw']}</h2>";
  if(($result['pw']) && ($result['pw'] === $_GET['pw'])){
    // !!THIS IS PAYLOAD GOLF CHALLENGE!!
    // My solution of ouroboros golf is 210byte.
    // If your solution is shorter than mine, you will get 5 point per 1 byte.
    $len = 210 - strlen($_GET['pw']);
    if($len > 0){
      solve(73,$len * 5);
    }
    else{
      echo "<h2>nice try :)</h2>";
    }
  }
  highlight_file(__FILE__);
?>
