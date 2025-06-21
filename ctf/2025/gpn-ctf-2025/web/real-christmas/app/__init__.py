from flask import Flask
from flask_sqlalchemy import SQLAlchemy
from flask_migrate import Migrate
from apscheduler.schedulers.background import BackgroundScheduler
from config import Config
from .tasks import deactivate_users_task

db = SQLAlchemy()
migrate = Migrate()
scheduler = BackgroundScheduler()


def create_app(config_class=Config):
    app = Flask(__name__)
    app.config.from_object(config_class)

    db.init_app(app)
    migrate.init_app(app, db)

    from app import routes

    app.register_blueprint(routes.bp)

    if not scheduler.running:
        scheduler.add_job(
            func=deactivate_users_task,
            args=[app],
            trigger="interval",
            seconds=app.config["DEACTIVATION_CHECK_INTERVAL"],
        )
        scheduler.start()
        # Ensure scheduler shuts down cleanly when the app exits
        import atexit

        atexit.register(lambda: scheduler.shutdown())

    return app
