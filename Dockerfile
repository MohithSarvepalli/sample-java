FROM openjdk
ADD target/keda-demo.jar keda-demo.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","keda-demo.jar"]