import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class day7 {
    static void rectangleDay1(Scanner s){
        double perimeter ,area, width,hight;
        System.out.print("inter the width : ");
        width=s.nextDouble();
        System.out.print("inter the hight : ");
        hight=s.nextDouble();
        area=width*hight;
        perimeter=(width+hight)*2;
        System.out.println("the area is :" + area);
        System.out.println("the perimeter is :" + perimeter);
    }
    static void convertTempDay1(Scanner s){
        double temp;
        System.out.print("inter the temp : ");
        temp= s.nextDouble();
        temp=((temp*9)/5)+32;
        System.out.println("the temp is :" + temp);

    }
    static  String gradeCategoryDay2(Scanner s){
        double grade ;
        System.out.print(" inter your grade :");
        grade=s.nextDouble();
        if(grade>100||grade<0){
           return "inter valid number ";
        }
        if(grade<=100&&grade>=90){
            return "your mark is A" ;
        }else if(grade<=89&&grade>=80){
            return "your mark is B" ;
        }else if(grade<=79&&grade>=70){
            return "your mark is C" ;
        }else if(grade<=69&&grade>=60){
            return "your mark is D" ;
        }else if(grade<=59&&grade>=0){
            return "your mark is F" ;
        }
        return "";

    }
    static void  leapYearDay2(Scanner s){
        int year;
        System.out.print("inter year :");
        year=s.nextInt();
        if (year % 400==0  || (year % 4==0 && year%100!=0 )){
                System.out.print(" it is  leap year");
        }else {

                System.out.print(" it is not leap year");

        }
    }
    static void  sumDay3(Scanner s){
        int number ,sum=0 ;
        System.out.print("inter number :");
        number=s.nextInt();
        if ( number <0) {
            System.out.print("inter valid number  :");
        }else{
            for(int i=0;i<=number;i++){
                sum+=i;
            }
            System.out.print("sum = "+ sum);
        }

    }
    static void  factorialDay3(Scanner s){
        int number ,factorial=1 ;
        System.out.print("inter number :");
        number=s.nextInt();
        if ( number <0) {
            System.out.print("inter valid number  :");
        }else{
            for(int i=1;i<=number;i++){
                factorial*=i;
            }
            System.out.print("factorial = "+ factorial);
        }

    }
    static void  evenNumberDay4(Scanner s){
        int number  ;
        System.out.print("inter number :");
        number=s.nextInt();
        if ( number <0) {
            System.out.print("inter valid number  :");
        }else{ if (number %2== 0)
            System.out.print("even number");
        }

    }
    static void  isPrimeDay4(Scanner s) {
        int number;
        boolean res =false;
        System.out.print("inter number :");
        number = s.nextInt();
        if (number < 0) {
            System.out.print("inter valid number  :");
        } else {
            for (int i=2 ;i<number;i++){
                if (number % i == 0) {
                    res = true;
                    break;
                }
            }


        }

        if( res == true){
            System.out.print("it is not prime number ");

        }else{
            System.out.print("it is prime number ");
        }

    }
    static void  Reverse1Day5(Scanner s) {
        String word;
        System.out.print("inter word :");
        word= s.nextLine();
        StringBuilder sb=new StringBuilder(word);
        System.out.println(sb.reverse());

    }
    static void  Reverse2Day5(Scanner s) {
        String word;
        System.out.print("inter word:");
        word= s.nextLine();
        for(int i=word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }
    }
    static void  Reverse3Day5(Scanner s){
        String word;
        System.out.print("inter word:");
        word= s.nextLine();
        char[] rev = new char[word.length()];
        for(int i=word.length()-1;i>=0;--i){
            rev[i]=word.charAt(i);
        }
        String result = new String(rev);
        System.out.println(result);
    }
    static void  vowelsDay5(Scanner s){
        String word;
        System.out.print("inter word:");
        word= s.nextLine();
        char[] rev = {'e','o','i','a','u'};
        String str =new String(rev);
        int count =0;
        for(int i=0;i<word.length();i++){
            if(str.contains(word.charAt(i)+"")){
                count++;
            }else{
                continue;
            }
        }
        System.out.print("the count is : " +count);

    }
    static  void palindromeDay5(Scanner s){
        String word,rev;
        System.out.print("inter your word");
        word=s.nextLine();
        if (!word.trim().isEmpty())
        {StringBuilder sb=new StringBuilder(word);
        rev=sb.reverse().toString();
            System.out.println("this word : "+ word );
            System.out.println("this reverse : "+ rev );
        if(rev.equalsIgnoreCase(word)){
            System.out.println("this word is palindrome ");
        }else {
            System.out.println("this word is not palindrome ");
        }
        }else{
            System.out.print("inter valid word ");
        }

    }
    static  void frequentDay5(Scanner s){
        String word;
        System.out.print("inter your word");
        word=s.nextLine();
        HashMap<Character,Integer> hash=new HashMap();
        for(int i=0;i<word.length();i++){
            if (hash.containsKey(word.charAt(i))){
                hash.put(word.charAt(i),(hash.get(word.charAt(i))+1));
            }else{
                    hash.put(word.charAt(i),1);
        }

        }
        for(char ch: hash.keySet()){
            System.out.println(ch + " : " + hash.get(ch));
        }



    }

}
