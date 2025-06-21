from flask import (
    Blueprint,
    current_app,
    redirect,
    request,
    jsonify,
    render_template,
    session,
    flash,
)
from app import db
from app.models import User
from config import Config
from pyisemail import is_email
from pyisemail.diagnosis import InvalidDiagnosis
from datetime import datetime, timedelta, timezone
from werkzeug.security import generate_password_hash, check_password_hash
from flask_graphql import GraphQLView
from app.graphql import schema
import os

bp = Blueprint("main", __name__)

FLAG_WAIT_SECONDS = Config.FLAG_WAIT_SECONDS


def get_logged_in_user():
    email = session.get("email")
    if not email:
        return None
    return User.query.filter_by(email=email).first()


@bp.route("/", methods=["GET"])
def index():
    return render_template("index.html")


@bp.route("/register", methods=["GET", "POST"])
def register():
    if request.method == "POST":
        email = request.form.get("email")
        password = request.form.get("password")

        if not email or not password:
            flash("Email and password are required.", "error")
            return render_template("register.html")

        result = is_email(email, diagnose=True, check_dns=False, allow_gtld=True)
        if isinstance(result, InvalidDiagnosis):
            flash(result, "error")
            return render_template("register.html")

        if User.query.filter_by(email=email).first():
            flash("Email already registered.", "error")
            return render_template("register.html")

        hashed_password = generate_password_hash(password)
        user = User(email=email, password_hash=hashed_password)
        db.session.add(user)
        db.session.commit()
        current_app.logger.info(f"User registered successfully: {email}")
        flash("User registered successfully.", "success")
        return redirect("/login")
    return render_template("register.html")


@bp.route("/login", methods=["GET", "POST"])
def login():
    if request.method == "POST":
        email = request.form.get("email")
        password = request.form.get("password")

        if not email or not password:
            flash("Email and password are required.", "error")
            return render_template("login.html")

        user = User.query.filter_by(email=email).first()
        if not user or not check_password_hash(user.password_hash, password):
            flash("Invalid email or password.", "error")
            return render_template("login.html")

        session["email"] = user.email
        current_app.logger.info(f"User logged in successfully: {email}")
        flash("Login successful.", "success")
        return redirect("/")
    return render_template("login.html")


@bp.route("/flag", methods=["GET"])
def get_flag():
    user = get_logged_in_user()
    if not user:
        flash("You must be logged in to access this page.", "error")
        current_app.logger.warning("Unauthorized access attempt to /flag")
        return redirect("/login")

    if not user.is_active:
        flash("User account is not active.", "error")
        current_app.logger.warning(
            f"Inactive user attempted to access flag: {user.email}"
        )
        return render_template("flag.html")

    if not user.is_admin:
        flash("User account is not an admin, lol.", "error")
        current_app.logger.warning(
            f"Non-admin user attempted to access flag: {user.email}"
        )
        return render_template("flag.html")

    registration_time = user.registration_time
    if registration_time.tzinfo is None:
        registration_time = registration_time.replace(tzinfo=timezone.utc)
    current_time = datetime.now(timezone.utc)

    if current_time - registration_time >= timedelta(seconds=FLAG_WAIT_SECONDS):
        flag = os.environ.get("FLAG")
        if not flag:
            flash("Internal error, please open a ticket!", "error")
            return render_template("flag.html")
        current_app.logger.info(f"Flag accessed by admin user: {user.email}")
        flash(f"Flag: {flag}", "success")
        return render_template("flag.html")
    else:
        flash(
            f"Flag will be available after {FLAG_WAIT_SECONDS} seconds from registration",
            "error",
        )
        current_app.logger.warning(
            f"Flag access attempt by user {user.email} before wait time."
        )
        return render_template("flag.html")


# navigate to /graphql to get a nice GraphQL playground
bp.add_url_rule(
    "/graphql", view_func=GraphQLView.as_view("graphql", schema=schema, graphiql=True)
)
