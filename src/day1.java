import java.util.Scanner;

import java.util.Scanner;
public class day1 {
public static  void day1(String [] arges ){
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
    System.out.println("my age is :"+age+"\n");}
}
