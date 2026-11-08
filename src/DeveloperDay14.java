import java.util.Scanner;

public class DeveloperDay14 extends Employee{
    private String programming;

    DeveloperDay14(Scanner s){
        super(s);
        s.nextLine();
        programming=super.validEmployeeName(s);
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("programming language: " +programming);
    }




}
