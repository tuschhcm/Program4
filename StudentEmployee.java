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

public class StudentEmployee extends Employee {
   
   //instance fields
   private int hoursWorked;
   private boolean isWorkStudy;
   private double payRate;
   
   //constructor
   public StudentEmployee(String name, String number, String working,
      String hours, String workstudy, String rate) {
      
      //call superclass constructor
      super(name, number, working);
      
      //parse remaining data into private fields
      hoursWorked = Integer.parseInt(hours);
      isWorkStudy = Boolean.parseBoolean(workstudy);
      payRate = Double.parseDouble(rate);
   }
   
   //getPay method returns payRate time hoursWorked
   public double getPay() {
      return hoursWorked * payRate;
   }
   
   //toString prints out the attributes of the object
   public String toString() {
      return super.toString() + "\t" + hoursWorked + "\t" +
         isWorkStudy + "\t" + payRate;
   }
}