import java.util.Scanner;

public class day1Practice {
    public static void day1Practice(String []arges){
        Scanner scanner= new Scanner(System.in);
        int numberOfBox;
        System.out.print("inter the size of shape: ");
        numberOfBox=scanner.nextInt();

        for(int i=0;i<numberOfBox;i++){
            for (int j=0;j<numberOfBox;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
