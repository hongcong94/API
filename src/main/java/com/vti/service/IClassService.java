package com.vti.service;

import java.util.List;

import com.vti.entity.Class;
import com.vti.specification.DateInClassFilter;

public interface IClassService {
	public List<Class> getAllClass(DateInClassFilter filter, String search);
}
