FROM python:3.11-slim

# Create a non-root user and group
RUN groupadd -r appuser && useradd -r -g appuser appuser

# Set the working directory
WORKDIR /usr/src/app

RUN mkdir -p /system/log
RUN mkdir -p /data/log
RUN chmod 777 /data/log

# Copy the application code and set appropriate ownership
COPY --chown=root:root flight.log /system/log/
COPY --chown=root:root server.py .
COPY --chown=root:root crc.py .
COPY --chown=root:root flag.txt /

# Switch to the non-root user
USER appuser

# Run the Python script as the non-root user
CMD ["python", "server.py"]

