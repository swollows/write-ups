FROM ubuntu:20.04

RUN apt-get -y update && apt-get -y upgrade
RUN apt-get -y install openjdk-8-jdk wget
RUN mkdir /usr/local/tomcat
RUN wget https://archive.apache.org/dist/tomcat/tomcat-8/v8.5.50/bin/apache-tomcat-8.5.50.tar.gz -O /tmp/tomcat.tar.gz
RUN cd /tmp && tar xvfz tomcat.tar.gz
RUN cp -Rv /tmp/apache-tomcat-8.5.50/* /usr/local/tomcat/
RUN rm -rf /usr/local/tomcat/webapps
COPY mvc.war /usr/local/tomcat/webapps/ROOT.war
COPY flag /flag
RUN groupadd -r www -g 501
RUN useradd -d /home/www -u 501 -m -s /bin/bash -g www www
RUN chown -R www:www /usr/local/tomcat
RUN chmod +x /usr/local/tomcat/bin/*.sh
EXPOSE 8080
EXPOSE 8009
USER www

CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]