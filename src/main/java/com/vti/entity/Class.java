package com.vti.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Table(name = "`Class`")
public class Class implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "ClassId", unique = true, nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short classID;

	@Column(name = "ClassName", nullable = false, length = 30)
	private String className;

	@Column(name = "StartDate")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date startDate;

	@Column(name = "EndDate")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date endDate;
	
	@Column(name = "`Description`", nullable = false, length = 100)
	private String description;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "ClassStatus")
	private ClassStatus status = ClassStatus.OPENING;
	
	@Column(name = "TotalStudent", nullable = false)
	private short totalStudent;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TeachingForm")
	private TeachingForm teachingForm = TeachingForm.OFFLINE;
	
	public Class() {
	}

	public short getClassID() {
		return classID;
	}

	public void setClassID(short classID) {
		this.classID = classID;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ClassStatus getStatus() {
		return status;
	}

	public void setStatus(ClassStatus status) {
		this.status = status;
	}

	public short getTotalStudent() {
		return totalStudent;
	}

	public void setTotalStudent(short totalStudent) {
		this.totalStudent = totalStudent;
	}

	public TeachingForm getTeachingForm() {
		return teachingForm;
	}

	public void setTeachingForm(TeachingForm teachingForm) {
		this.teachingForm = teachingForm;
	}

}
