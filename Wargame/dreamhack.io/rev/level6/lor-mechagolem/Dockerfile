FROM ubuntu:22.04@sha256:965fbcae990b0467ed5657caceaec165018ef44a4d2d46c7cdea80a9dff0d1ea

ENV user prob
ENV LD_PRELOAD='/libc.so.6'

RUN apt update
RUN apt-get install -y socat

RUN adduser $user

COPY ./deploy/flag_diablo /home/$user/flag
COPY ./deploy/lor /home/$user/prob
COPY ./deploy/libc.so.6 /libc.so.6

RUN chown -R root:$user /home/$user
RUN chown root:$user /home/$user/flag
RUN chown root:$user /home/$user/prob

RUN chmod 755 /home/$user/prob
RUN chmod 440 /home/$user/flag

WORKDIR /home/$user
USER $user
EXPOSE 6666
CMD socat TCP-LISTEN:6666,reuseaddr,fork EXEC:/home/$user/prob
