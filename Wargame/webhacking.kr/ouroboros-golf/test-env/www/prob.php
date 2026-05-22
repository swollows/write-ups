<?php
// Local test harness mimicking webhacking.kr Ouroboros Golf (challenge 73).
// The first 3 lines (config include, login_chk, print_best_golfer) are stubbed.

$db = mysqli_connect('db', 'ouro', 'ouropw', 'ouroboros');
if (!$db) {
    http_response_code(500);
    exit('db connect fail: ' . mysqli_connect_error());
}

if (preg_match("/\./i", $_GET['pw'] ?? '')) exit("No Hack ~_~");

$pw = $_GET['pw'] ?? '';
$query = "select pw from prob_ouroboros where pw='{$pw}'";
echo "<hr>query : <strong>" . htmlspecialchars($query) . "</strong><hr><br>\n";

$result = @mysqli_fetch_array(mysqli_query($db, $query));

if ($result['pw'] ?? null) {
    echo "<h2>Pw : " . htmlspecialchars($result['pw']) . "</h2>\n";
}

if (($result['pw'] ?? null) && ($result['pw'] === $pw)) {
    $len = 210 - strlen($pw);
    echo "<pre>len(pw)=" . strlen($pw) . "  saved=" . max(0, $len) . "  points=" . max(0, $len) * 5 . "</pre>\n";
    if ($len > 0) {
        echo "<h2 style='color:green'>SOLVED ($len bytes saved => " . ($len * 5) . " pts)</h2>\n";
    } else {
        echo "<h2>nice try :)</h2>\n";
    }
} else {
    echo "<pre>not solved\nresult[pw]=" . var_export($result['pw'] ?? null, true) . "\nGET[pw]   =" . var_export($pw, true) . "\nlen(GET[pw])=" . strlen($pw) . "</pre>\n";
}
