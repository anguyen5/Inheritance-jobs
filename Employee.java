/*
   Author: Raghavi Sakpal
   Date: 10/12/2021
   Description: Pratice with Inherita ce - Law Frim Employee
*/
public class Employee{
   //Instance Field
   private int workHours = 40;
   private double salary = 40000;
   private int vacDays = 10;
   private String form = "yellow";
   
   //Instance Methods
   /*
      Mehtod: Return number of work hours
      Param : None
      Return: int
   */
   public int getWorkHours(){
      return this.workHours;
   }
   
   public double getSalary(){
      return this.salary;
   }
   /*
      Mehtod: Return number of vacation days
      Param : None
      Return: int
   */
   public int getVacDays(){
      return this.vacDays;
   }
   /*
      Method: Return form leaves application
      Param: None
      Return: string
   */
   public String getForm(){
      return this.form;
   }
}

class EmployeeMain{
   public static void main(String[] args){
      //Create an instance of Employee
      Employee e = new Employee(); // default Java constructor
      
      //Test behavior of the Employee e
      System.out.println("Employee work hours: " + e.getWorkHours());
      System.out.println("Employee salary: " + e.getSalary());
      System.out.println("Employee vacation days: " + e.getVacDays());
      System.out.println("Empoyee needs to fill: " + e.getForm() + " form for leave application." );
   }
}