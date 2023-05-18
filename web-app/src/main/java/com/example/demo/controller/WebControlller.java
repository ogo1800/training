package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebControlller {


		@GetMapping(value = "/")
		public  String index(Model model) {
			

			model.addAttribute("message", "ようこそ");
			model.addAttribute("datetime", LocalDateTime.now());
			return "index";
		}

}
