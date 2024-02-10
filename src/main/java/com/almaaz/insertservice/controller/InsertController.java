package com.almaaz.insertservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.almaaz.insertservice.model.Employee;
import com.almaaz.insertservice.repository.InsertRepository;

@RestController
@RequestMapping("/insert")
public class InsertController {
	
	@Autowired
	InsertRepository insertrepository;
	@PostMapping("/addEmployee")
	public ResponseEntity<String> insertEmployee(@RequestBody Employee employee) {
		insertrepository.save(employee);
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}
}
