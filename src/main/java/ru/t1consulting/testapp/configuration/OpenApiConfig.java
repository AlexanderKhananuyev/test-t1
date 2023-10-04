package ru.t1consulting.testapp.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Test-T1",
                description = "Подсчёт количества вхождений символов",
                version = "1.0.0",
                contact = @Contact(
                        name = "Александр Ханануев",
                        email = "khananuyev@outlook.com"
                )
        )
)
public class OpenApiConfig {}