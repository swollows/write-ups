FROM ubuntu:24.04@sha256:3f85b7caad41a95462cf5b787d8a04604c8262cdcdf9a472b8c52ef83375fe15

RUN apt-get update && apt-get install -y apache2
RUN a2enmod proxy proxy_http proxy_ftp proxy_connect proxy_html
COPY proxy.conf /etc/apache2/sites-available/proxy.conf
RUN a2ensite proxy.conf && a2dissite 000-default.conf
EXPOSE 80
CMD ["apachectl", "-D", "FOREGROUND"]
