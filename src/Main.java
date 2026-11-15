import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
int [] arr={9,7,3,2,5,6};
        findSeconed(arr);


        scanner.close();
    }
    static void reverseString (Scanner s){
        String st,rev="";
//        StringBuilder sb = new StringBuilder();
        System.out.print("inter String: ");
        st=s.nextLine();
        for(int i=st.length()-1;i>=0;i--){
//            sb.append(st.charAt(i)+"");
            rev+=st.charAt(i);
        }
//        System.out.println("your reverse string is : "+ sb);
        System.out.println("your reverse string is : "+ rev);

    }
    static void Checknumber (Scanner s){
        int num;
        boolean res=true;
        System.out.println("inter your number :");
        num= s.nextInt();
        if (num <= 1) {
            res = false;
        }

        for(int i=num-1;i>1;i--){
            if(num%i==0){
                res=false;
                break;
            }
        }
        System.out.println(res ? "number is prime" : "number is not prime");


    }
    static void  findSeconed(int [] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: arr){list.add(i);}
       list=list.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Secound number : "+ list.get(list.size()-2));
    }
    static void  Checkanagrams(Scanner s){
        String str1,str2;
        System.out.println("inter first string 1 ");
        str1=s.nextLine();
        System.out.println("inter first string 2 ");

    }





}