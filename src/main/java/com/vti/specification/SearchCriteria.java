package com.vti.specification;

public class SearchCriteria {
	// key - the filed name
	// operation - lessThan, greaterThan, search
	// value- dataType: enum, string, int, date,...

	private String key;
	private String operation;
	private Object value;

	public SearchCriteria(String key, String operator, Object value) {
		this.key = key;
		this.operation = operator;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}


}
