package org.example.buildingservice;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info =
@Info(title = "Building Service API", version = "1", description = "Documentation Building Service API v1.0")
)
public class BuildingServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BuildingServiceApplication.class, args);
    }

}
