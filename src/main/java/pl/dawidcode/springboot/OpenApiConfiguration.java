package pl.dawidcode.springboot;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Cartoon Application API").description(
                                "This is a sample application with Spring Boot and OpenAPI")
                        .version("1.0.1"));
    }

    @Bean
    public GroupedOpenApi controllerOpenApi() {
        return GroupedOpenApi
                .builder()
                .group("home")
                .packagesToScan("pl.dawidcode.springboot.controllers")
                .build();
    }

    @Bean
    public GroupedOpenApi bookOpenApi() {
        return GroupedOpenApi
                .builder()
                .group("book")
                .packagesToScan("pl.dawidcode.springboot.book")
                .build();
    }



}
