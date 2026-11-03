import java.util.Scanner;

public class Manager extends day10{
    private int teamSize;
    Manager(Scanner s){
        super(s);
        System.out.println("inter your team Size : ");
        teamSize=s.nextInt();
        while (teamSize<=0){
            System.out.println("inter your team Size: ");
            teamSize=s.nextInt();
        }

    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("your team size is : " + teamSize);
    }
}
