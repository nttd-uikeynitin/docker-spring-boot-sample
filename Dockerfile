FROM java:8
VOLUME /tmp
ADD /src/wait-for-it.sh wait-for-it.sh
RUN bash -c 'touch /wait-for-it.sh'
ADD /target/admin-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]