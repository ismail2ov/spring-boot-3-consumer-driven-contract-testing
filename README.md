# Example of Consumer Driven Contract Testing with Spring Boot 3

This is a straightforward example demonstrating how to use Spring Cloud Contract to establish a contract between two Spring Boot 3 applications: one acting as the **Producer** and the other as the **Consumer** of a REST API.

## Producer

We have created a simple application with Spring Boot that does not yet have an implementation, but we have the contracts to be able to create the contracts.

### Create the stubs

- Compile and install the stubs skipping the tests because we don't have any logic implemented yet
``` shell
 mvn clean install -pl catalog -DskipTests
```