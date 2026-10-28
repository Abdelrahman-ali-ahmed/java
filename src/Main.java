import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    int n, count =0;
    System.out.print("inter the number ");
    n= scanner.nextInt();
 if (n>0){
    while(n>0){
        count++;
        n=n/10;
    }

 }else{
     System.out.println("inter valid number ");
 }
    System.out.print("the number : " +count);









}
}