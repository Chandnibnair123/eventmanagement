package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Quatation;
import com.example.demo.service.QuatationService;



@RestController
public class QuatationController {
	
	@Autowired
	private QuatationService quatationService;
	
	@GetMapping("/quatation/{id}")
	public Quatation getQuatation(@PathVariable String id ) {

		Quatation quatation= quatationService.FindQuatationById(id);
		return quatation;
		}
	
	@PostMapping("/quatation")
	public Quatation createQuatation(@RequestBody Quatation quatation) {
		quatationService.addQuatation(quatation);
		return quatation;
		}
}


	



