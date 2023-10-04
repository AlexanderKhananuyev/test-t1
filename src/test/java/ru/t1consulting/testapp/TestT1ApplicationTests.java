package ru.t1consulting.testapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.t1consulting.testapp.controller.AppController;
import ru.t1consulting.testapp.services.AppService;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class TestT1ApplicationTests {

    @Autowired
    private AppController controller;
    @Autowired
    private AppService service;

    @Test
    public void testContext() throws Exception {
        assertThat(controller).isNotNull();
        assertThat(service).isNotNull();
    }
}