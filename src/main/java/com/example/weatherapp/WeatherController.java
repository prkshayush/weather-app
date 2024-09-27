package com.example.weatherapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

@RestController
public class WeatherController {

    // Inject the API key from the application.properties file
    @Value("${weather.api.key}")
    private String apiKey;

    @GetMapping("/weather")
    public Map<String, Object> getWeather(@RequestParam String city) {
        // Use the API key stored in application.properties
        String url = String.format("http://api.openweathermap.org/data/2.5/weather?q=%s&units=metric&appid=%s", city, apiKey);

        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> response = restTemplate.getForObject(url, HashMap.class);

        Map<String, Object> result = new HashMap<>();
        if (response != null && response.get("main") != null) {
            result.put("temperature", ((Map<String, Object>) response.get("main")).get("temp"));
            result.put("description", ((List<Map<String, Object>>) response.get("weather")).get(0).get("description"));
        } else {
            result.put("error", "Unable to retrieve weather data. Please check the city name.");
        }

        return result;
    }
}
