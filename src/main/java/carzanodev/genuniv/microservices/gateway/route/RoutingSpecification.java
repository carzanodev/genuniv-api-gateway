package carzanodev.genuniv.microservices.gateway.route;

public enum RoutingSpecification {
    GENERAL_INFO(
            "/api/v1/school-year/**",
            "/api/v1/school-period/**",
            "/api/v1/schedule/**"
    ),
    COLLEGE(
            "/api/v1/college/**",
            "/api/v1/classroom/**",
            "/api/v1/course/**",
            "/api/v1/degree/**",
            "/api/v1/degree-type/**",
            "/api/v1/offering/**"
    ),
    PERSONAL_RECORDS(
            "/api/v1/student/**",
            "/api/v1/faculty/**",
            "/api/v1/staff/**"
    ),
    ENROLMENT(
            "/api/v1/enrolment/**"
    );

    private String[] services;

    RoutingSpecification(String... services) {
        this.services = services;
    }

    public String[] getServices() {
        return this.services;
    }

}
