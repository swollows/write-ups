FROM python:3.10-slim@sha256:161d1e3deddba156d7834d15e6fe4d010b3b6f69f18ee1cfba9348e712f4a4ba

WORKDIR /app
COPY app.py /app
RUN pip install fastapi==0.111.0 uvicorn==0.29.0
EXPOSE 8000
CMD ["uvicorn", "app:app", "--host", "0.0.0.0", "--port", "8000", "--reload"]
