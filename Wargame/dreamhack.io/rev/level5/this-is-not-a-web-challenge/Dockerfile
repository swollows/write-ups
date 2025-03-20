FROM httpd:2.4.59@sha256:36c8c79f900108f0f09fd4148ad35ade57cba0dc19d13f3d15be24ce94e6a639

COPY ./deploy/module.so /usr/local/apache2/modules/module.so
COPY ./deploy/custom.conf /usr/local/apache2/conf/custom.conf

COPY ./deploy/flag /flag
COPY ./deploy/index.html /index.html

RUN echo "\nInclude conf/custom.conf" >> /usr/local/apache2/conf/httpd.conf