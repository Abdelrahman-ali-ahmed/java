import java.util.Scanner;

public class day2 {
    public static void day2 (String [] args){
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("Inter the first number : ");
        num1=scanner.nextInt();
        System.out.println("Inter the secound number : ");
        num2=scanner.nextInt();
        if(num1 > 0){
            System.out.print("the first number "+num1 +" is positive");
        }else if (num1 < 0){
            System.out.print("the first number "+num1 +" is negetive");
        }else{
            System.out.print("the first number is Zero");
        }
        if(num2 > 0){
            System.out.print("the seconed number "+num2 +" is positive");
        }else if (num2 < 0){
            System.out.print("the seconed number "+num2 +" is negetive");
        }else{
            System.out.print("the seconed number is Zero");
        }
        if(num1%2==0){
            System.out.println("the first number is even");
        }else{
            System.out.println("the first number is odd");
        }
        if(num2%2==0){
            System.out.println("the seconed number is even");
        }else{
            System.out.println("the seconed number is odd");
        }
        /////////////////////////
        int num3;
        System.out.println("Inter the first number : ");
        num1=scanner.nextInt();
        System.out.println("Inter the secound number : ");
        num2=scanner.nextInt();
        System.out.println("Inter the secound number : ");
        num3=scanner.nextInt();
        if ( num1>=num2){
            if(num1>=num3){
                System.out.println("the bigest number : " + num1);
            }else{
                System.out.println("the bigest number : " + num3);
            }

        }else{if(num2>=num3){
            System.out.println("the bigest number : " + num2);
        }else{
            System.out.println("the bigest number : " + num3);
        }

        }
        /////////////////////////////////////////////////////////
        int grade;
        System.out.println("Inter your grade  : ");
        grade =scanner.nextInt();
        if (grade >=90){
            System.out.print("your grade is : A");
        }else if (grade >=80){
            System.out.print("your grade is : B");
        }else if (grade >=70){
            System.out.print("your grade is : C");
        }else if (grade >=60){
            System.out.print("your grade is : D");
        }else{
            System.out.print("your grade is : F");
        }
        ///////////////////////////////////////////////////////
        int year;
        System.out.println("Inter year  : ");
        year =scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("That year is a leap year");
        } else if (year % 100 == 0) {
            System.out.println("That year is a normal year");
        } else if (year % 4 == 0) {
            System.out.println("That year is a leap year");
        } else {
            System.out.println("That year is a normal year");
        }
        //////////////////////////////////////
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
