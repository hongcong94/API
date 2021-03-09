package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.vti.entity.Class;
import com.vti.repository.IClassRepository;
import com.vti.specification.ClassSpecificationBuilder;
import com.vti.specification.DateInClassFilter;


//Truyen vao 2 tham so la search va filter

@Service
public class ClassService implements IClassService {
	@Autowired
	private IClassRepository classRepository;

	@Override
	public List<Class> getAllClass(DateInClassFilter filter, String search) {
	ClassSpecificationBuilder classBuilder = new ClassSpecificationBuilder(filter, search);
	
		return classRepository.findAll(classBuilder.build());
	}

}
