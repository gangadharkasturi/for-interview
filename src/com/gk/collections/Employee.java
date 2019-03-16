package com.gk.collections;

public class Employee {

	int empId;
	String eName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + "]";
	}
}
