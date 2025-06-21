import os

basedir = os.path.abspath(os.path.dirname(__file__))


class Config:
    SECRET_KEY = os.urandom(32).hex()
    SERVICE_TOKEN_KEY = os.urandom(128).hex()
    SQLALCHEMY_DATABASE_URI = "sqlite:///" + os.path.join(basedir, "app.db")
    SQLALCHEMY_TRACK_MODIFICATIONS = False
    GRAPHQL_ENDPOINT = "http://localhost:5000/graphql"
    FLAG_WAIT_SECONDS = 20
    DEACTIVATION_CHECK_INTERVAL = 5  # seconds
