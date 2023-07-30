'''
    burp 같은 프록시 툴로 접근 후 response 패킷까지 전부 중간 캡처하도록 설정한 다음 아래 소스 코드의 내용을 수정한다.

    function anim(elem, pos, dis){
      function move() {
        pos += dis;
        if (pos > max_pos) {
          pos = 0;
        }
        elem.style.transform = `translateX(${pos}px)`;
        requestAnimationFrame(move);
      }
      move();
    }
    => 여기에서 translateX(${pos}px) 를 translateX(10px)로 변경하면 전체 플래그 보임
'''

FLAG = '''DH{Too_H4rd_to_sEe_th3_Ch4rs_x.x}'''