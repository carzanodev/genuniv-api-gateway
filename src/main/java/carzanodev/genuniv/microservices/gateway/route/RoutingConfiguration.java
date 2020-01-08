package carzanodev.genuniv.microservices.gateway.route;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static carzanodev.genuniv.microservices.gateway.route.RoutingSpecification.COLLEGE;
import static carzanodev.genuniv.microservices.gateway.route.RoutingSpecification.ENROLMENT;
import static carzanodev.genuniv.microservices.gateway.route.RoutingSpecification.GENERAL_INFO;
import static carzanodev.genuniv.microservices.gateway.route.RoutingSpecification.PERSONAL_RECORDS;

@Configuration
public class RoutingConfiguration {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path(GENERAL_INFO.getServices())
                        .uri("lb://general-info-service"))
                .route(p -> p
                        .path(COLLEGE.getServices())
                        .uri("lb://college-service"))
                .route(p -> p
                        .path(PERSONAL_RECORDS.getServices())
                        .uri("lb://personal-records-service"))
                .route(p -> p
                        .path(ENROLMENT.getServices())
                        .uri("lb://enrolment-service"))
                .build();
    }

}
