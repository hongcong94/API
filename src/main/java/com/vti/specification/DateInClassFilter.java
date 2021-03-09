package com.vti.specification;

import java.util.Date;

public class DateInClassFilter {
	private Date startDate;
	private Date endDate;


public DateInClassFilter(Date startDate,Date endDate) {
	this.startDate = startDate;
	this.endDate = endDate;

}

public DateInClassFilter() {
	
}

public Date getStartDate() {
	return startDate;
}


public void setStartDate(Date startDate) {
	this.startDate = startDate;
}


public Date getEndDate() {
	return endDate;
}


public void setEndDate(Date endDate) {
	this.endDate = endDate;
}

}