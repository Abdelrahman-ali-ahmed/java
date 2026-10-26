import java.util.Scanner;

import java.util.Scanner;
public class day1 {
public static  void day1(String [] arges ) {
    String name="Abdelrahman Ali Ahmed" ,career="Telesales advisor";
    int age=23;
    Scanner scanner = new Scanner(System.in);
    int a, i,sum,diff,prodect,quoient   ;
    System.out.print("please inter A : ");
    a=scanner.nextInt();
    System.out.print("please inter I : ");
    i=scanner.nextInt();
    sum=a+i;
    prodect= a*i;
    if(a>=i){
        diff= a-i;
        quoient =a%i;
    }else{
        diff= i-a;
        quoient =i%a;
    }

    System.out.println("the sum is : "+ sum);
    System.out.println("the sum diff : "+ diff);
    System.out.println("the sum prodect : "+ prodect);
    System.out.println("the sum quoient : "+ quoient);
    System.out.print("inter your name : ");
    //////////////////////////////////////////////////
    name = scanner.nextLine();
    System.out.print("inter your career:");
    career = scanner.nextLine();
    System.out.print("inter your age : ");
    age=scanner.nextInt();
    System.out.println("my name is :"+name+"\n");
    System.out.println("my career is :"+career+"\n");
    System.out.println("my age is :"+age+"\n");
    /////////////////////////////////////////
    double f1,f2,area;
    System.out.print("inter the vertical 1:  ");
    f1= scanner.nextDouble();
    System.out.print("inter the vertical 2:  ");
    f2= scanner.nextDouble();
    area=f1* f2;
    System.out.print("The area of Triangle = "+area);
    /////////////////////////////////////////////
    double C,F;
    System.out.print("inter the temperature in Celsius :  ");
    C= scanner.nextDouble();
    F=((C*9)/5)+32;

    System.out.print("the temperature in Fahrenheit = "+F+"°F");
     // i made mistake in equation  from that   F=(C*(9/5))+32; to   F=((C*9)/5)+32;
}
}
