FROM java:8
COPY ./mysql-connector-java-8.0.13.jar /mysql-connector-java-8.0.13.jar
COPY ./Main.java /Main.java
COPY ./wait.sh /usr/local/bin/wait.sh
RUN apt-get update -y && apt-get install -y mysql-client
CMD ["wait.sh", "mysql", "--", "run.sh"]
RUN ["javac", "Main.java"]
CMD ["java", "-cp", ".:mysql-connector-java-8.0.13.jar", "Main"]
