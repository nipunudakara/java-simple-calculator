FROM openjdk:17-slim
WORKDIR /app
COPY SimpleCalculator.java .
RUN javac SimpleCalculator.java
CMD ["java", "SimpleCalculator"]

