<?php
  include "./config.php";
  login_chk();
  $db = dbconnect("phantom");

  if($_GET['joinmail']){
    if(preg_match('/duplicate/i', $_GET['joinmail'])) exit("nice try");
    $query = "insert into prob_phantom values(0,'{$_SERVER[REMOTE_ADDR]}','{$_GET[joinmail]}')";
    mysqli_query($db,$query);
    echo "<hr>query : <strong>{$query}</strong><hr>";
  }

  $rows = mysqli_query($db,"select no,ip,email from prob_phantom where no=1 or ip='{$_SERVER[REMOTE_ADDR]}'");
  echo "<table border=1><tr><th>ip</th><th>email</th></tr>";
    while(($result = mysqli_fetch_array($rows))){
    if($result['no'] == 1) $result['email'] = "**************";
    echo "<tr><td>{$result[ip]}</td><td>".htmlentities($result[email])."</td></tr>";
  }
  echo "</table>";

  $_GET[email] = addslashes($_GET[email]);
  $query = "select email from prob_phantom where no=1 and email='{$_GET[email]}'";
  $result = @mysqli_fetch_array(mysqli_query($db,$query));
  if(($result['email']) && ($result['email'] === $_GET['email'])){ mysqli_query($db,"delete from prob_phantom where no != 1"); solve("phantom"); }
  highlight_file(__FILE__);
?>
