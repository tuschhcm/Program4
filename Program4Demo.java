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

import java.util.*;
import java.io.*;

public class Program4Demo {
	public static void main(String[] args) throws FileNotFoundException {
	
		//calculate total number of employees
		//loop control assumes first 3 command line args
		//are number of employees of each type
		int totalEmployees = 0;
		
		for(int i = 0; i < 3; i++) {
			totalEmployees += Integer.parseInt(args[i]);
		}
		
		//create an array to hold employee objects
		Employee[] workers = new Employee[totalEmployees];
		
		//setup file to be read
		File file = new File(args[3]);
		Scanner inputFile = new Scanner(file);
		inputFile.useDelimiter("\n");
		
		int index = 0; //where to load next employee in workers array
		
		do{
			
			//import student employees
			for(int i = 0; i < Integer.parseInt(args[0]); i++) {
				String employeeData = inputFile.next();
				String[] params = employeeData.split(",");
				
				workers[index] = new StudentEmployee(params [0], params [1],
					params[2], params[3], params[4], params[5]);
				
				index++;
			}
			
			//import classified Staff employees
			for(int i = 0; i < Integer.parseInt(args[1]); i++) {
				String employeeData = inputFile.next();
				String[] params = employeeData.split(",");
				
				workers[index] = new ClassifiedStaff(params [0], params [1],
					params[2], params[3], params[4]);
				
				index++;
			}
			
			//import faculty employees
			for(int i = 0; i < Integer.parseInt(args[2]); i++) {
				String employeeData = inputFile.next();
				String[] params = employeeData.split(",");
				
				workers[index] = new Faculty(params [0], params [1],
					params[2], params[3], params[4], params[5]);
				
				index++;
			}
		} while(inputFile.hasNext());
		
		//print every employees toString
		for(Employee employee : workers) {
			System.out.println(employee.toString());
		}
		
		//print every employee that is working's pay
		System.out.println("\nPay for two-week pay period");
		System.out.println("===========================");
		
		for(Employee employee : workers) {
			
			if(employee.isWorking()){
				System.out.print(employee.getName());
				System.out.printf("\t\t$%,.2f%n", employee.getPay());
			}
		}
	}
}