# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built JAR from the target folder (replace 'your-app.jar' with the actual name of your JAR file)
COPY target/authsystem-0.0.1-SNAPSHOT.jar app.jar

# Expose the new port
EXPOSE 8000

# Run the Spring Boot app
CMD ["java", "-jar", "app.jar"]
