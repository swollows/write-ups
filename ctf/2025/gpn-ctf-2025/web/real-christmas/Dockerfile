# docker build -t real-christmas . && docker run -p 5000:5000 real-christmas
FROM python:3.12-slim

WORKDIR /app

# Install system dependencies and pipx
RUN apt-get update && apt-get install -y --no-install-recommends \
    python3-pip python3-venv \
    && pip install --no-cache-dir uv \
    && rm -rf /var/lib/apt/lists/*

COPY pyproject.toml uv.lock ./
RUN uv run sync

# Copy application code
COPY app/ app/
COPY main.py config.py run.py ./
RUN uv run flask db init \
    && uv run flask db migrate -m "Initial migration" \
    && uv run flask db upgrade

# Set environment variables for Flask
ENV FLASK_APP=run.py
ENV FLASK_ENV=production

ARG FLAG="GPNCTF{fake_flag}"
ENV FLAG=${FLAG}

# Use a production WSGI server
CMD ["uv", "run", "gunicorn", "--log-level", "debug", "--access-logfile", "-", "--bind", "0.0.0.0:5000", "run:app"]
