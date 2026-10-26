import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
   int score;
    System.out.println("Inter score : ");
    score =scanner.nextInt();

    if (score<0){
        System.out.print("please inter valid number ");
    }else if (score> 100){
        System.out.print("please inter valid number ");
    }else{
        System.out.print("this is  valid number  ");
    }








}
}