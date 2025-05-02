package com.doubleo.admingateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"test", "redis", "security", "eureka", "swagger", "routes", "actuator"})
class AdminGatewayApplicationTests {

    @Test
    void contextLoads() {
    }

}
