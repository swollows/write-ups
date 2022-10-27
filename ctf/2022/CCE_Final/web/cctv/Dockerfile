FROM ubuntu:22.04

RUN apt-get update -y
RUN apt-get install -y apache2 qemu-system qemu-user qemu-system-mips 
RUN cd /etc/apache2/mods-enabled && ln -s ../mods-available/cgi.load
RUN . /etc/apache2/envvars
RUN service apache2 stop
RUN service apache2 start

COPY main.cgi /usr/lib/cgi-bin/login.cgi
COPY main.cgi /usr/lib/cgi-bin/ping.cgi
COPY main.cgi /usr/lib/cgi-bin/view.cgi
COPY main.cgi /usr/lib/cgi-bin/index.cgi
COPY login.html /usr/lib/cgi-bin/login.html
COPY admin.html /usr/lib/cgi-bin/admin.html

RUN chown www-data:www-data  /usr/lib/cgi-bin/login.cgi
RUN chown www-data:www-data  /usr/lib/cgi-bin/ping.cgi
RUN chown www-data:www-data  /usr/lib/cgi-bin/view.cgi
RUN chown www-data:www-data  /usr/lib/cgi-bin/index.cgi
RUN chown www-data:www-data  /usr/lib/cgi-bin/login.html
RUN chown www-data:www-data  /usr/lib/cgi-bin/admin.html

COPY video /etc/video
COPY login.db /etc/login.db

RUN chown www-data:www-data  /etc/video
RUN chown www-data:www-data  /etc/login.db


COPY ./flag /flag
RUN chmod 440 /flag
RUN chown -R root:www-data /flag

RUN echo '<script>location.href = "/cgi-bin/";</script>' > /var/www/html/index.html
RUN echo '<script>location.href = "/cgi-bin/";</script>' > /usr/share/apache2/default-site/index.html

CMD apachectl -DFOREGROUND -k start
