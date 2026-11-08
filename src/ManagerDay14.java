import java.util.Scanner;

public class ManagerDay14 extends Employee{
    public  int teamSize;
    ManagerDay14(Scanner s){
        super(s);
        teamSize=super.validEmployeeId(s);
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Team size :" + teamSize );
    }



}
