package ru.t1consulting.testapp.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(MockitoExtension.class)
class AppServiceImplTest {

    private final AppServiceImpl appService = new AppServiceImpl();

    @Test
    public void testGetCountCharsWithNullInput() {
        String result = appService.calculateCharacterFrequency(null);
        assertNull(result);
    }

    @Test
    public void testGetCountCharsWithEmptyInput() {
        String result = appService.calculateCharacterFrequency("");
        assertEquals("", result);
    }

    @Test
    public void testGetCountCharsWithValidInput() {
        String result = appService.calculateCharacterFrequency("aaaaabcccc");
        assertEquals("\"a\": 5, \"c\": 4, \"b\": 1", result);
    }
}