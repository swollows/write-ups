FROM php:7.4-apache

RUN apt-get update && apt-get upgrade -y && apt-get install libonig-dev

RUN docker-php-ext-install mysqli
RUN docker-php-ext-install mbstring

RUN rm -rf /var/www/html/

COPY ./html /var/www/html/

RUN mkdir /tmp/cache && chmod 777 /tmp/cache

RUN chmod 777 /var/www/html/upload/

EXPOSE 80