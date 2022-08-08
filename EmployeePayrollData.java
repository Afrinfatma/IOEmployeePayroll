package com.employeepayroll;

public class EmployeePayrollData {
    public int id;
    public String name;
     public double salary;
     
     public EmployeePayrollData (Integer id,String name,Double salary) {
    	 this.id= id;
    	 this.name=name;
    	 this.salary=salary;
     }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
@Override
public String toString() {
	return "id="+id +"name=" +name + "salary=" +salary;
}
}