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

public abstract class Employee{ 

//private instance variable fields
private String employeeName;
private int employeeId;
private boolean isWorking; // true if currently working; false otherwise
      
   // Constructor - All args passed in as Strings
   public Employee(String name, String id, String isworking) {
      employeeName = name;
      employeeId = Integer.parseInt(id);
      isWorking = Boolean.parseBoolean(isworking);
   }

   public String getName() {
      return employeeName;
   }

   public void setName(String name) {
      employeeName = name;
   }

   public int getEmployeeId() {
      return employeeId;
   }

   public void setEmployeeId(int id) {
      employeeId = id;
   }

   public boolean isWorking() {
      return isWorking;
   }

   public void setIsWorking(boolean employed) {
      isWorking = employed;
   }

   public String toString() {
      return employeeName + "\t" + employeeId + "\t" + isWorking;
   }
   
   public abstract double getPay();
}