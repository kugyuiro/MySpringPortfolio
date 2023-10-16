package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.form.WeatherData;

@Service
public class WeatherService {

    @Value("${openweathermap.apiKey}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherData getWeatherData(double latitude, double longitude) {
        String apiUrl = String.format("http://api.openweathermap.org/data/2.5/weather?lat=%f&lon=%f&appid=%s", latitude, longitude, apiKey);
        WeatherData weatherData = restTemplate.getForObject(apiUrl, WeatherData.class);

        // 緯度と経度を設定
        weatherData.setLatitude(latitude);
        weatherData.setLongitude(longitude);

        return weatherData;
    }
}
