import os
import sys
import requests
from flask import Flask, request, render_template, redirect, url_for, session, flash, abort, g
from uuid import uuid4
from functools import wraps
from helper import validate_url

app = Flask(__name__)
app.secret_key = os.urandom(24)

app.config['SESSION_COOKIE_SAMESITE'] = 'Strict'

notes = {}

BOT_URL = os.environ.get('BOT_URL', 'http://bot_service:3000')
CSP_POLICY = (
    "default-src 'none'; "
    "script-src 'self'; "
    "style-src https://cdn.simplecss.org 'self'; "
    "img-src *; "
    "base-uri 'none';"
    "frame-ancestors 'none';"
)

@app.context_processor
def inject_user():
    return dict(current_user=session.get('user'))

@app.after_request
def apply_csp(response):
    response.headers['Content-Security-Policy'] = CSP_POLICY
    response.headers['X-Frame-Options'] = 'DENY'
    return response

def login_required(f):
    @wraps(f)
    def decorated(*args, **kwargs):
        if 'user' not in session:
            return redirect(url_for('login', next=request.endpoint))
        g.user = session['user']
        return f(*args, **kwargs)
    return decorated

@app.route('/')
def index():
    if 'user' in session:
        return redirect(url_for('dashboard'))
    return redirect(url_for('login'))

@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        username = request.form['username']
        if not username:
            flash('Please provide a username', 'danger')
        else:
            session['user'] = username
            return redirect(url_for('dashboard'))
    return render_template('login.html')

@app.route('/logout')
def logout():
    session.clear()
    flash('Logged out', 'info')
    return redirect(url_for('login'))

@app.route('/dashboard')
@login_required
def dashboard():
    user_notes = [(nid, notes[nid]['title']) for nid in notes if notes[nid]['owner'] == g.user]
    return render_template('dashboard.html', user_notes=user_notes)

@app.route('/note/new', methods=['GET', 'POST'])
@login_required
def new_note():
    with open('emojis.txt', 'r', encoding='utf-8') as f:
        EMOJIS = f.read()
    if request.method == 'POST':
        title = request.form['title']
        content = request.form['content']
        image_url = request.form.get('image_url', '').strip()
        if image_url and not validate_url(image_url, target_domain='imgur.com'):
            flash('Invalid image URL', 'danger')
            return render_template('note_form.html', emojis=list(EMOJIS))
        note_id = str(uuid4())
        notes[note_id] = {'owner': g.user, 'title': title, 'content': content, 'image_url': image_url}
        flash('Note created', 'success')
        return redirect(url_for('view_note', note_id=note_id))
    return render_template('note_form.html', emojis=list(EMOJIS))

@app.route('/note/<note_id>')
@login_required
def view_note(note_id):
    note = notes.get(note_id)
    if not note:
        abort(404)
    user_notes = [(nid, notes[nid]['title']) for nid in notes if notes[nid]['owner'] == g.user]
    return render_template('view_note.html', note=note, note_id=note_id, user_notes=user_notes)

@app.route('/bot', methods=['GET'])
def bot():
    url = request.args.get('url', '')
    if not url:
        return 'Missing url parameter', 400
    if not validate_url(url, target_domain='example.com'):
        return 'Invalid URL', 400
    print(f"Contacting bot service {BOT_URL} with URL: {url}", flush=True)
    try:
        response = requests.post(f'{BOT_URL}/bot', json={'url': url})
        return response.text, response.status_code
    except requests.exceptions.RequestException as e:
        return f'Error contacting bot: {e}', 500

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=9222)
