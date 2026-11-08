import java.util.Scanner;

public class ManagerDay14 extends Employee{
    private   int teamSize;

    protected int validTeamSize(Scanner scanner){
        while(true){
            try{
                System.out.print("please inter team Size : ");
                int size=scanner.nextInt();
                if(size>0){
                    return size;
                }else {
                    throw new IllegalArgumentException("Enter a valid Team Size!");
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    ManagerDay14(Scanner s){
        super(s);
        teamSize=super.validEmployeeId(s);
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Team size :" + teamSize );
    }
    public int getTeamSize(){
        return teamSize;
    }
    public void setTeamSize(Scanner s){
        teamSize=validTeamSize(s);
    }








}
