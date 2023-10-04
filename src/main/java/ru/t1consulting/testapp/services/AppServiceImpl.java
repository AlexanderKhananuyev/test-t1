package ru.t1consulting.testapp.services;

import org.springframework.stereotype.Service;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AppServiceImpl implements AppService {
    public String calculateCharacterFrequency(String request) {
        if (request == null) {
            return null;
        }

        Map<Character, Integer> frequencyMap = request.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.summingInt(c -> 1)));

        String result = frequencyMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .map(entry -> "\"" + entry.getKey() + "\": " + entry.getValue())
                .collect(Collectors.joining(", "));

        return result;
    }
}