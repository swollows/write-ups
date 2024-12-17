#!/usr/bin/python3
from flask_sqlalchemy import SQLAlchemy
from env import FLAG

db = SQLAlchemy()


class User(db.Model):
    __tablename__ = 'users'
    idx = db.Column(db.Integer, primary_key=True)
    username = db.Column(db.String(32), unique=True)
    password = db.Column(db.String(64))


def init_db(app):
    with app.app_context():
        db.app = app
        db.init_app(app)
        db.create_all()
        db.session.add(User(username='admin', password=FLAG))
        db.session.commit()
