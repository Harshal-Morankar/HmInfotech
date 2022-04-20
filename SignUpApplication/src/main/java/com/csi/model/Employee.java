package com.csi.model;

public class Employee {
	
	private int empid;
	private String  empName;
	private String empAddress;
	private double  empSalary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpemailid() {
		return empemailid;
	}
	public void setEmpemailid(String empemailid) {
		this.empemailid = empemailid;
	}
	public long getEmpcontactnumber() {
		return empcontactnumber;
	}
	public void setEmpcontactnumber(long empcontactnumber) {
		this.empcontactnumber = empcontactnumber;
	}
	public Employee(int empid, String empName, String empAddress, double empSalary, String empemailid,
			long empcontactnumber) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
		this.empemailid = empemailid;
		this.empcontactnumber = empcontactnumber;
	}
	private String empemailid;
	private long empcontactnumber;
	

}
