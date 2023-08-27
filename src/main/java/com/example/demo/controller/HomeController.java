package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.TestDTO;
import com.example.demo.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Hello World!!");
		List<TestDTO> list = homeService.selectAll();
		for(TestDTO dto : list) {
			System.out.println(dto.getName());
		}
		return "test";
	}
	
}
