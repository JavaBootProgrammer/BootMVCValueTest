package com.nt.restapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController
{
	@Value("${spring.application.name}")
	private String appName;
	@Value("${PATH}")
	private String path;

	@GetMapping("/name")
	public String appName() {
		System.out.println(appName);
		return appName;
	}
	@GetMapping("/path")
	public String getAppName() {
		System.out.println(path);
		return path;
	}


}
