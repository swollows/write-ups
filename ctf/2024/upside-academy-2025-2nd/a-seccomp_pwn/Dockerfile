FROM ubuntu:24.04@sha256:3f85b7caad41a95462cf5b787d8a04604c8262cdcdf9a472b8c52ef83375fe15

ENV user seccomp_pwn
ENV chall_port 31337

RUN apt-get update
RUN apt-get -y install socat

RUN useradd -u 1001 $user

COPY ./deploy/$user /home/$user/$user
RUN chown root:$user /home/$user/$user
RUN chmod 755 /home/$user/$user

WORKDIR /home/$user
USER $user
EXPOSE $chall_port
CMD socat -T 60 TCP-LISTEN:$chall_port,reuseaddr,fork EXEC:/home/$user/$user
