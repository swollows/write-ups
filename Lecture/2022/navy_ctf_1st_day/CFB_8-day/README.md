## 접속 정보

`nc 202.182.110.129 7777`


```python
# pip install pwntools

from pwn import *
r = remote('202.182.110.129', 7777)
r.interactive()
```
