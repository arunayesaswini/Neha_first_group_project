package com.greatlearning.model;

public class DriverClass {

	public static void main(String[] args) {
		
		AdminDepartment ad = new AdminDepartment();
	
		ad.departmentName();
		ad.getTodaysWork();
		ad.getWorkDeadline();
		ad.isTodayAHoliday();
		
		System.out.println("\n\n");
		
		HrDepartment hr = new HrDepartment();
		
		hr.departmentName();
		hr.doActivity();
		hr.getTodaysWork();
		hr.getWorkDeadline();
		hr.isTodayAHoliday();
		
		System.out.println("\n\n");
		
		TechDepartment td = new TechDepartment();
		
		td.departmentName();
		td.getTodaysWork();
		td.getWorkDeadline();
		td.getTechStackInformation();
		td.isTodayAHoliday();
		
		System.out.println("\n\n");
		
	}
}
