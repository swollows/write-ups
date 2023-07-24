<?php
  
include("util.php");

$ch = curl_init();

$uri = url_encode($_GET['uri']);
// var_dump($uri);
// $uri = $_GET['uri'];

curl_setopt($ch, CURLOPT_URL, $uri);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
curl_setopt($ch, CURLOPT_CONNECTTIMEOUT, 10);
curl_setopt($ch, CURLOPT_SSL_VERIFYPEER, false);
 
$response = curl_exec($ch);
curl_close($ch);
 
echo $response;

echo "<br><br>";
highlight_file(__FILE__);

?>
