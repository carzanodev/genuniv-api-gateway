# 1. Overview
The api-gateway serves as the single entry point for all clients wanting to access the services. It basically does the routing of client calls to the appropriate services, and could apply filters and add data to the requests as needed.

It's common for microservices to be very granuralized. The purpose of the api-gateway is to unify client requests to potentially multiple services in a single common point where common logic could be applied (e.g. authentication). In addition, services need to be hidden from clients and should almost never expose their IPs. This is achieved by using [Spring Cloud Gateway](https://cloud.spring.io/spring-cloud-gateway/reference/html/), following the [API Gateway Pattern](https://microservices.io/patterns/apigateway.html) of Microservices patterns.

![api-gateway](./.assets/genuniv-api-gateway.png)