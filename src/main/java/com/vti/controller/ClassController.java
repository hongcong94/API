package com.vti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vti.entity.Class;
import com.vti.service.IClassService;
import com.vti.specification.DateInClassFilter;

@RestController
@RequestMapping(value = "api/v1/class")
public class ClassController {
	@Autowired
	private IClassService classService;

	@GetMapping()
	public ResponseEntity<?> getAllClass( DateInClassFilter filter, @RequestParam(required = false) String search) {
		List<Class> entities = classService.getAllClass(filter, search);
		return new ResponseEntity<List<Class>>(entities, HttpStatus.OK);
	}

}
