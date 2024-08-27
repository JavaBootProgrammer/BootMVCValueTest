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

	@Value("#{systemProperties['java.home']}")
	private String javaHome;

	@Value("10")
	private String defaultValue;

	@Value("${UNKNOWABLE}:10")
	private String unknownValue;

	@Value("${colors}")
	private String listColors;

	@Value("${colors_map}")
	private String colors_map;

	@Value("#{${colors_map}.key1}")
	private String colors_map_index;

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
	@GetMapping("/javaHome")
	public String getJavaHome() {
		System.out.println(javaHome);
		return javaHome;
	}
	@GetMapping("/defaultValue")
	public String getDefaultValue() {
		System.out.println(defaultValue);
		return defaultValue;
	}
	@GetMapping("/unknownValue")
	public String getUnknownValue() {
		System.out.println(unknownValue);
		return unknownValue;
	}
	@GetMapping("/listColors")
	public String getListColors() {
		System.out.println(listColors);
		return listColors;
	}

	@GetMapping("/colors_map")
	public String getListColorsMap() {
		System.out.println(colors_map);
		return colors_map;
	}
	@GetMapping("/colors_map_index")
	public String getListColorsMap_index() {
		System.out.println(colors_map_index);
		return colors_map_index;
	}


}
