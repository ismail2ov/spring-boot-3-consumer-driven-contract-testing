# Example of Consumer Driven Contract Testing with Spring Boot 3

This is a straightforward example demonstrating how to use Spring Cloud Contract to establish a contract between two Spring Boot 3 applications: one acting as the **Producer** and the other as the **Consumer** of a REST API.

## Producer

### Create the stubs

- Compile and install the stubs
``` shell
 mvn clean install -pl catalog
```


## Consumer

- Compile and package the consumer
``` shell
 mvn clean package -pl shop
```

