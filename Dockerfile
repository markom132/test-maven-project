# getting base image ubuntu
FROM ubuntu

MAINTAINER Marko Markovic <markomarkoviccb@gmail.com>

RUN apt-get update

CMD ["echo", "Hello World... from my first docker image"]
