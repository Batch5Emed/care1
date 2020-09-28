package com.carefirst.nex.myfirstproject;

import java.util.Comparator;

public class Employees implements Comparable<Employees> {
	private String name;
	private int salary ;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Employees(String name, int salary, int age) {
		
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public Employees()
	{
		
	}
	/*public static Comparator<Employees> StuNameComparator = new Comparator<Employees>() {

		public int compare(Employees s1, Employees s2) {
		   String StudentName1 = s1.getName().toUpperCase();
		   String StudentName2 = s2.getName().toUpperCase();

		   //ascending order
		   return StudentName1.compareTo(StudentName2);

		   //descending order
		   //return StudentName2.compareTo(StudentName1);
	    }};*/
	@Override
	public int compareTo(Employees emp) {
		// TODO Auto-generated method stub
	       return (this.getAge() - emp.getAge());

	}
	
}