package com.example.demo.form;

import java.util.List;

public class WeatherData {
	
    private Main main;
    private List<Weather> weather;
    private double latitude;
    private double longitude;
    // GetterとSetterを追加する

    public static class Main {
        private double temp;
        private int humidity;
        
		public double getTemp() {
			return temp;
		}
		public void setTemp(double temp) {
			this.temp = temp;
		}
		public int getHumidity() {
			return humidity;
		}
		public void setHumidity(int humidity) {
			this.humidity = humidity;
		}

        // GetterとSetterを追加する
    }

    public static class Weather {
        private String description;

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

        // GetterとSetterを追加する
    }

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
