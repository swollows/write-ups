FROM ubuntu:22.04

ENV user chall
ENV chall_port 2222

RUN apt-get update
RUN apt-get install -y socat

RUN adduser $user

ADD ./deploy/flag /home/$user/flag
ADD ./deploy/$user /home/$user/$user

RUN chown -R root:$user /home/$user
RUN chown root:$user /home/$user/flag
RUN chown root:$user /home/$user/$user

RUN chmod 755 /home/$user/$user
RUN chmod 440 /home/$user/flag

WORKDIR /home/$user
USER $user
EXPOSE $chall_port
CMD socat -T 30 TCP-LISTEN:$chall_port,reuseaddr,fork EXEC:/home/$user/$user
