package com.klef.soa.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("User Authentication API")
                        .version("1.0")
                        .description("Hardcoded User Credential Authentication")
                        .contact(new Contact()
                                .name("KLUniversity")
                                .email("demo@example.com")));
    }
}
