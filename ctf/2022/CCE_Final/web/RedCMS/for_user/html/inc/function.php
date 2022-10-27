<?php
	if(!defined('__MAIN__')) exit('!^_^!');

	define('MAX_SERIALIZED_INPUT_LENGTH', 10240);
	define('MAX_SERIALIZED_ARRAY_LENGTH', 256);
	define('MAX_SERIALIZED_ARRAY_DEPTH', 5);

	
	function render_page($page) {
		$template = __TEMPLATE__ . $page  . '_page.php';

		if(!is_file($template)){
			alert('파일을 찾을수 없습니다.', 'back');
		}

		include($template);
		exit;
	}

	function upperorlower($str,$mode="upper") {
		if($mode == "upper") {
			if(mb_detect_encoding($str) == "UTF-8") {
				return mb_strtoupper($str);
			} else {
				return strtoupper($str);
			}
		} else {
			if(mb_detect_encoding($str) == "UTF-8") {
				return mb_strtolower($str);
			} else {
				return strtolower($str);
			}
		}
	}

	function alert($msg, $location) {

		$msg = htmlspecialchars($msg, ENT_QUOTES);
		$location = htmlspecialchars($location, ENT_QUOTES);

		if($location === 'back'){
			exit('<script>alert("' . $msg. '"); history.go(-1);</script>');
		}

		exit('<script>alert("' . $msg . '"); location.href="' . $location . '";</script>');
	}

	function valid_str($str, $type) {
		switch (trim($type)) {
			case 'username':
				if(strlen($str) > 30 || preg_match('/[^a-z0-9_]/', $str)) return false;
				break;
			case 'email':
				if(strlen($str) > 50 || !filter_var($str, FILTER_VALIDATE_EMAIL)) return false;
				break;
			default:
				return false;
				break;
		}
		return true;
	}

	function is_login() {
		if($_SESSION['idx']) return true;
		return false;
	}

	function clean_html($str) {
		return htmlspecialchars($str, ENT_QUOTES);
	}

	function clean_sql($str) {
		return addslashes($str);
	}

	function now() {
		return date("Y-m-d H:i:s");
	}

	function safe_unserialize($str) {
		
		$str = upperorlower($str,"");

		if(strlen($str) > MAX_SERIALIZED_INPUT_LENGTH) {
			return false;
		}

		if(empty($str) || !is_string($str)) {
			return false;
		}

		$stack = $list = $expected = array();
		$state = 0;

		while($state != 1) {
			$type = isset($str[0]) ? $str[0] : '';

			if($type == '}') {
				$str = substr($str, 1);
			} else if($type == 'n' && $str[1] == ';') {
				$value = null;
				$str = substr($str, 2);
			} else if($type == 'b' && preg_match('/^b:([01]);/', $str, $matches)) {
				$value = $matches[1] == '1' ? true : false;
				$str = substr($str, 4);
			} else if($type == 'i' && preg_match('/^i:(-?[0-9]+);(.*)/s', $str, $matches)) {
				$value = (int)$matches[1];
				$str = $matches[2];
			} else if($type == 'd' && preg_match('/^d:(-?[0-9]+\.?[0-9]*(E[+-][0-9]+)?);(.*)/s', $str, $matches)) {
				$value = (float)$matches[1];
				$str = $matches[3];
			} else if($type == 's' && preg_match('/^s:([0-9]+):"(.*)/s', $str, $matches) && mb_substr($matches[2], (int)$matches[1], 2) == '";') {
				$value = mb_substr($matches[2], 0, (int)$matches[1]);
				$str = mb_substr($matches[2], (int)$matches[1] + 2);
			} else if($type == 'a' && preg_match('/^a:([0-9]+):{(.*)/s', $str, $matches) && $matches[1] < MAX_SERIALIZED_ARRAY_LENGTH) {
				$expectedLength = (int)$matches[1];
				$str = $matches[2];
			} else {
				return false;
			}

			switch($state) {
				case 3:
					if($type == 'a') {
						if(count($stack) >= MAX_SERIALIZED_ARRAY_DEPTH) {
							return false;
						}

						$stack[] = &$list;
						$list[$key] = array();
						$list = &$list[$key];
						$expected[] = $expectedLength;
						$state = 2;
						break;
					}
					if($type != '}') {
						$list[$key] = $value;
						$state = 2;
						break;
					}
					return false;

				case 2:
					if($type == '}') {
						if(count($list) < end($expected)) {
							return false;
						}
						unset($list);
						$list = &$stack[count($stack)-1];
						array_pop($stack);
						array_pop($expected);
						if(count($expected) == 0) {
							$state = 1;
						}
						break;
					}
					if($type == 'i' || $type == 's') {
						if(count($list) >= MAX_SERIALIZED_ARRAY_LENGTH) {
							return false;
						}
						if(count($list) >= end($expected)) {
							return false;
						}

						$key = $value;
						$state = 3;
						break;
					}
					return false;

				case 0:
					if($type == 'a') {
						if(count($stack) >= MAX_SERIALIZED_ARRAY_DEPTH) {
							return false;
						}

						$data = array();
						$list = &$data;
						$expected[] = $expectedLength;
						$state = 2;
						break;
					}
					if($type != '}') {
						$data = $value;
						$state = 1;
						break;
					}
					return false;
			}
		}
		return $data;
	}

	function safe_serialize($value) {
		if(is_null($value)) {
			return upperorlower('n;');
		}

		if(is_bool($value)) {
			return upperorlower('b:'.(int)$value.';');
		}

		if(is_int($value)) {
			return upperorlower('i:'.$value.';');
		}

		if(is_float($value)) {
			return upperorlower('d:'.str_replace(',', '.', $value).';');
		}

		if(is_string($value)) {
			return upperorlower('s:'.mb_strlen($value).':"'.$value.'";');
		}

		if(is_array($value)) {
			$out = '';
			foreach($value as $k => $v) {
				$out .= safe_serialize($k) . safe_serialize($v);
			}

			return upperorlower('a:'.count($value).':{'.$out.'}');
		}
		return false;
	}

?>