package com.vyom.spl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vyom.spl.services.CityServices;

@Controller
public class AppController {

	@Autowired
	CityServices cityService;
	
	@GetMapping("/cities")
	public String getAllCities(Model model) {
		model.addAttribute("cities",cityService.getAllCities());
		return "cities";
	}
}
