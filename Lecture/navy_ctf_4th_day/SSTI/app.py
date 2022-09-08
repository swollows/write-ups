from flask import Flask
from flask import render_template_string
from flask import request

#flag in /home/web/flag

app = Flask(__name__)
@app.route('/', methods=['GET', 'POST'])
def home():
    user = request.args.get('user')
    if not user:
        user = 'guest'
    template = '''Hello %s !!!'''%user
    return render_template_string(template)

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5001, debug=True)
