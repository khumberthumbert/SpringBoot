package com.yedam.app.emp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpVO {
//	EMPLOYEE_ID	NUMBER(6,0)
//	FIRST_NAME	VARCHAR2(20 BYTE)
//	LAST_NAME	VARCHAR2(25 BYTE)
//	EMAIL	VARCHAR2(25 BYTE)
//	PHONE_NUMBER	VARCHAR2(20 BYTE)
//	HIRE_DATE	DATE
//	JOB_ID	VARCHAR2(10 BYTE)
//	SALARY	NUMBER(8,2)
//	COMMISSION_PCT	NUMBER(2,2)
//	MANAGER_ID	NUMBER(6,0)
//	DEPARTMENT_ID	NUMBER(4,0)
	private String employeeId;
	private String firstName;
	private String lastName;
	private String email;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date hireDate;
	private String jobId;
}
