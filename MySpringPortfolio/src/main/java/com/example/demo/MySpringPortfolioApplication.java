package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * アプリケーション起動クラス
 * 
 * @author ys-fj
 *
 */
@SpringBootApplication
public class MySpringPortfolioApplication {
   
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
	/**
	 * アプリケーションを起動します。
	 * 
	 * @param args 起動に必要な引数
	 */
	public static void main(String[] args) {
		SpringApplication.run(MySpringPortfolioApplication.class, args);
	}

}
