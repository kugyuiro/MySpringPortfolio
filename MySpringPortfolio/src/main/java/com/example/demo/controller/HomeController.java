package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.constant.UrlConst;
import com.example.demo.form.HomeForm;
import com.example.demo.form.WeatherData;
import com.example.demo.service.WeatherService;


@Controller
public class HomeController {
    
	private final WeatherService weatherService;

    public HomeController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
	/**
	 * 画面の初期表示を行います。
	 * 
	 * <p>その際、ユーザー情報から権限を確認し、ユーザー管理が可能かどうかを判定した結果を画面に渡します。
	 * 
	 * @param user 認証済みユーザー情報
	 * @param model モデル
	 * @return メニュー画面
	 */
	@GetMapping(UrlConst.HOME)
	public String home(Model model, HomeForm form) {
        // 仮のGPS座標
        double latitude = 35.68;
        double longitude = 139.76;

        WeatherData weatherData = weatherService.getWeatherData(latitude, longitude);

        model.addAttribute("weatherData", weatherData);

		return "home";
	}
	
    @PostMapping(UrlConst.HOME)
    public String home() {
        return "home"; 
    }
}
