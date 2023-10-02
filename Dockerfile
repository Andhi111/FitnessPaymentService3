FROM openjdk:11-jre-slim
COPY build/libs/FitnessPaymentService3.jar /FitnessPaymentService3.jar
CMD ["java", "-jar", "/FitnessPaymentService3.jar"]