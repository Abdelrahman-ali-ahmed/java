import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main (String [] args){
    String name="Abdelrahman Ali Ahmed" ,career="Telesales advisor";
    int age=23;
    Scanner scanner = new Scanner(System.in);
    System.out.print("inter your name : ");
    name = scanner.nextLine();
    System.out.print("inter your career:");
    career = scanner.nextLine();
    System.out.print("inter your age : ");
    age=scanner.nextInt();
    System.out.println("my name is :"+name+"\n");
    System.out.println("my career is :"+career+"\n");
    System.out.println("my age is :"+age+"\n");

}
}