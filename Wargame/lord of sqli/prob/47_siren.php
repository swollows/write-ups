// query : {"id":null,"pw":null}
<?php
  include "./config.php";
  login_chk();
  $db = mongodb_connect();
  $query = array(
    "id" => $_GET['id'],
    "pw" => $_GET['pw']
  );
  echo "<hr>query : <strong>".json_encode($query)."</strong><hr><br>";
  $result = mongodb_fetch_array($db->prob_siren->find($query));
  if($result['id']) echo "<h2>Hello User</h2>";

  $query = array("id" => "admin");
  $result = mongodb_fetch_array($db->prob_siren->find($query));
  if($result['pw'] === $_GET['pw']) solve("siren");
  highlight_file(__FILE__);
?>
