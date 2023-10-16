package com.example.demo.form;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class HomeForm {
	/** ログインID */
	@Length(min = 8, max = 20)
	private String loginId;


}
