import java.util.Scanner;

public class Manager extends day10{
    private int teamSize;
    private int validteamSize(Scanner s){
        int size;
        System.out.println("inter your team size  : ");
        size=s.nextInt();
        while (size>0){
            System.out.println("inter your team size : ");
            size=s.nextInt();
        }
        return size;

    }
    Manager(Scanner s){
        super(s);
        teamSize=validteamSize(s);

    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("your team size is : " + teamSize);
    }
    public int getTeamSize(){
        System.out.println("team size :"+ teamSize);
        return teamSize;
    }
    public void setTeamSize(Scanner s){
        teamSize=validteamSize(s);
    }
}
