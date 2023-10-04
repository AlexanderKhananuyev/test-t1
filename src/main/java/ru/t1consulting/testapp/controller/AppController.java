package ru.t1consulting.testapp.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.t1consulting.testapp.services.AppService;

@RestController
@Tag(name = "Контроллер", description = "Считает количество вхождений символов")
@RequestMapping("api/calculateCharacterFrequency")
public class AppController {
    @Autowired
    @Parameter (description = "Внедрение зависимости в сервисный контроллер")
    private AppService serviceImpl;

    @Operation(summary = "Подсчет количества вхождений символов",
               description = "Считает количество вхождений символов и сортирует их по убыванию")
    @PostMapping()
    public String getCountChars(String input) {
        return serviceImpl.calculateCharacterFrequency(input);
    }
}