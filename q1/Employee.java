package test;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String empname;
	private int empid;
	private Double salary;
	private List<Employee> subordinates;
	
	public Employee(String empname, int empid, Double salary){
		
		this.empname=empname;
		this.empid=empid;
		this.salary=salary;
		this.subordinates=new ArrayList<Employee>();
	}
	
	public void add(Employee e){
		this.subordinates.add(e);
	}
	
	public void remove(Employee e){
		this.subordinates.remove(e);
	}
	
	public List<Employee> getSubordinates(){
		
		return subordinates;		
	}
	
	public String toString(){
		
		return empname;
		
	}
}
