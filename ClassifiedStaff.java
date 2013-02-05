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

public class ClassifiedStaff extends Employee {
	
	//private fields
	private double weeklySalary;
	private String division;
	
	//constructor
	public ClassifiedStaff(String name, String number, String working,
		String salary, String div) {
		
		//call superclass constructor
		super(name, number, working);
		
		//move remaining data into private fields
		weeklySalary = Double.parseDouble(salary);
		division = div;
	}
	
	//getPay returns weeklySalary times two
	public double getPay() {
		return weeklySalary * 2;
	}
	
	//toString returns object attributes
	public String toString() {
		return super.toString() + "\t" + weeklySalary + "\t" + division;
	}
}