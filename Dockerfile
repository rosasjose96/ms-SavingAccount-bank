FROM openjdk:8
VOLUME /temp
EXPOSE 8096
ADD ./target/ms-SavingAccount-bank-0.0.1-SNAPSHOT.jar savingaccount-service.jar
ENTRYPOINT ["java","-jar","/savingaccount-service.jar"]