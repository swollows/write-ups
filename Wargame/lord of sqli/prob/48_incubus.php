// query : {"$where":"function(){return obj.id==''&&obj.pw=='';}"}
<?php
  include "./config.php";
  login_chk();
  $db = mongodb_connect();
  if(preg_match('/prob|_|\(/i', $_GET['id'])) exit("No Hack ~_~");
  if(preg_match('/prob|_|\(/i', $_GET['pw'])) exit("No Hack ~_~");
  $query = array("\$where" => "function(){return obj.id=='{$_GET['id']}'&&obj.pw=='{$_GET['pw']}';}");
  echo "<hr>query : <strong>".json_encode($query)."</strong><hr><br>";
  $result = mongodb_fetch_array($db->prob_incubus->find($query));
  if($result['id']) echo "<h2>Hello {$result['id']}</h2>";

  $query = array("id" => "admin");
  $result = mongodb_fetch_array($db->prob_incubus->find($query));
  if($result['pw'] === $_GET['pw']) solve("incubus");
  highlight_file(__FILE__);
?>
