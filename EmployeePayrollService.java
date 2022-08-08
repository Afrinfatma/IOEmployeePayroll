package com.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	public enum IOService{Console_IO,File_IO,Db_IO,Rest_IO}
    private List<EmployeePayrollData> employeePayrollList;
    public EmployeePayrollService() {}
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {}
	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList=new ArrayList<>();
		EmployeePayrollService employeepayrollservice=new EmployeePayrollService(employeePayrollList);
		Scanner scanner=new Scanner(System.in);
        employeepayrollservice.readEmployeePayrollData(scanner);
        employeepayrollservice.writeEmployeePayrollData();
	
		
	}
	private void writeEmployeePayrollData() {
		System.out.println("\n Writing employee payroll to console\n" +employeePayrollList);
		
	}
	private void readEmployeePayrollData(Scanner scanner) {
		System.out.println("Enter Employee Id:");
		int id=scanner.nextInt();
		System.out.println("Enter Employee Name:");
		String name=scanner.next();
		System.out.println("Enter Employee Salary:");
		double salary=scanner.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id,name,salary));
	}

}
