//***********************************************************************
// Project: Program 4
//
// Author: Craig Tuschhoff
//
// Completion time: 3 hours total
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (write names here or no one) in designing and
// debugging my program.
//***********************************************************************

public class Faculty extends Employee {
	
	//private fields
	private double annualSalary;
	private int weeksPerYear;
	private String department;
	
	//constructor
	public Faculty (String name, String number, String working,
		String salary, String weeks, String dept) {
		
		//call superclass constructor
		super(name, number, working);
		
		//move remaining data into private fields
		annualSalary = Double.parseDouble(salary);
		weeksPerYear = Integer.parseInt(weeks);
		department = dept;
	}
	
	// toString returns object attributes
	public String toString() {
		return super.toString() + "\t" + annualSalary + "\t" +
			weeksPerYear + "\t" + department;
	}
	
	// getPay returns total pay
	public double getPay() {
		return (annualSalary * 2)/weeksPerYear;
	}
}