import java.util.Scanner;

public class day10 {
     private double salary ;
     private String name;
     boolean con;
     day10(Scanner s){

         System.out.print("Enter your name: ");
         name = s.nextLine();

         while (!name.matches("[a-zA-Z]+")) {
             System.out.print("Enter a valid name: ");
             name = s.nextLine();
         }

         System.out.print("Enter your salary: ");
         salary = s.nextDouble();

         while (salary <= 0) {
             System.out.print("Enter a valid salary: ");
             salary = s.nextDouble();
         }
     }
     void displayInfo() {
         System.out.println("your name is : " + name );
         System.out.println("your salary is : " + salary );
     }

}
