package com.sai.sai.rest;

import java.util.Scanner;

abstract class employee {

	abstract void setSalary(int salary);

	abstract int getSalary();

	abstract void setGrade(String grade);

	abstract String getGrade();

	void label() {
		System.out.println();
	}
}

class engineer extends employee {
	String gra;
	int sal;

	public void setSalary(int salary) {
		this.sal = salary;
	}

	public int getSalary() {
		return sal;
	}

	public void setGrade(String grade) {
		this.gra = grade;
	}

	public String getGrade() {
		return gra;
	}
}

class manager extends employee {
	String gra2;
	int sal2;

	public void setSalary(int salary) {
		sal2 = salary;
	}

	public int getSalary() {
		return sal2;
	}

	public void setGrade(String grade) {
		this.gra2 = grade;
	}

	public String getGrade() {
		return gra2;
	}
}

public class sample {
	public static void main(String[] args) {
		engineer e = new engineer();
		e.setSalary(1000);
		e.setGrade("A");
		System.out.println("Employee Grade: " + e.getGrade());
		System.out.println("Employee Salary: " + e.getSalary());
		manager m = new manager();
		m.setGrade("B");
		m.setSalary(2000);
		System.out.println("Manager Grade: " + m.getGrade());
		System.out.println("Manager Salary: " + m.getSalary());
	}
}