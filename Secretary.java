/*
   Author: Raghavi Sakpal
   Date: 10/12/2021
   Description: Pratice with Inherita ce - Law Frim Employee
*/
public class Secretary extends Employee{
   /*
      Method: Secretary can take dictation
      Param: string
      Return: void
   */
   public void takeDictation(String text){
      System.out.println(text);
   }

}
class SecretaryMain{
   public static void main(String[] args){
      Secretary s = new Secretary(); //default constructor
      
      //inherited behavior
      System.out.println("Employee work hours: " + s.getWorkHours());
      System.out.println("Employee salary: " + s.getSalary());
      System.out.println("Employee vacation days: " + s.getVacDays());
      System.out.println("Empoyee needs to fill: " + s.getForm() + " form for leave application." );
      
      //unique Behavior
      s.takeDictation("Schedule a meeting at 10am Tuseday 12");
   }

   
}
