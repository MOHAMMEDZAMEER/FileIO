package com.entity;

public class EmployeePayRool {

	int ID;
	String NAME;
	Double SALARY;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public Double getSALARY() {
		return SALARY;
	}
	public void setSALARY(Double sALARY) {
		SALARY = sALARY;
	}
	@Override
	public String toString() {
		return "EmployeePayRool [ID=" + ID + ", NAME=" + NAME + ", SALARY=" + SALARY + "]";
	}
	
	
	
}
