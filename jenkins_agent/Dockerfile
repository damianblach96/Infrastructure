FROM jenkins/ssh-agent:4.2.1-jdk11
USER root
RUN apt-get update && apt-get install -y curl git python3 python3-pip unzip ansible wget
RUN groupadd -g 997 docker && usermod -aG docker jenkins
RUN curl -fsSl https://get.docker.com | sh
RUN wget -o docker-compose https://github.com/docker/compose/releases/download/v2.14.0/docker-compose-linux-x86_64 && chmod +x docker-compose && mv docker-compose /usr/bin
RUN curl https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip -o awscliv2.zip && unzip awscliv2.zip && ./aws/install