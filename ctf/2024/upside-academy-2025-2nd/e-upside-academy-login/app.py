#!/usr/bin/python3
from flask import Flask, request, render_template, redirect, url_for
from env import SECRET_KEY
from models import db, init_db
from sqlalchemy.sql import text


# init app
app = Flask(__name__)
app.config.update(
    SECRET_KEY=SECRET_KEY,
    SQLALCHEMY_DATABASE_URI='sqlite://',
)
init_db(app)


@app.route('/')
def index():
    return render_template('index.html')


@app.route('/api/login', methods=['GET', 'POST'])
def login():
    if request.method == "POST":
        username, password = request.form.get('username', ''), request.form.get('password', '')
        result = list(db.session.execute(text(f'SELECT * FROM USERS WHERE username = "{username}" and password = "{password}"')))
        if result:
            return {'error': '', 'result': True}

        return {'error': 'check username or password'}, 401
    else:
        return redirect(url_for('index'))


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=8000)
