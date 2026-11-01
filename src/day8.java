import java.util.Scanner;

public class day8 {
    private int age;
    private String name ;
    private double grade;
     day8 (Scanner s){

         System.out.print("Enter age: ");
         this.age = Integer.parseInt(s.nextLine());

         System.out.print("Enter grade: ");
         this.grade = Double.parseDouble(s.nextLine());

         System.out.print("Enter name: ");
         this.name = s.nextLine();
     }
     void displayInfo(){
         System.out.println("the age is : "+ age);
         System.out.println("the name is : "+ name);
         System.out.println("the grade is : "+ grade);

     }
}
