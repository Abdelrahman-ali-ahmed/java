import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//    int [] arr={9,7,3,2,5,6};
//        findSeconed(arr);
        Checkanagrams(scanner);


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
        str1=s.nextLine().toLowerCase();
        System.out.println("inter first string 2 ");
        str2=s.nextLine().toLowerCase();
        HashMap<Character,Integer>strMap1=new HashMap<>();
        HashMap<Character,Integer>strMap2=new HashMap<>();
        if(str1.trim().length()!=str2.trim().length()){
            System.out.println("there are not angrams");
            return;
        }
        strMap1=charcterFrequent(str1);
        strMap2=charcterFrequent(str2);

        System.out.println(strMap1.equals(strMap2)?"there are  angrams":"there are not angrams");



    }

    public static HashMap<Character,Integer> charcterFrequent(String st ){
        HashMap<Character,Integer>strMap=new HashMap<>();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)!=' '){
                if(strMap.containsKey(st.charAt(i))){
                    strMap.put(st.charAt(i),strMap.get(st.charAt(i))+1);
                }else{
                    strMap.put(st.charAt(i),1);
                }
            }else{
                continue;
            }

        }
     return strMap;
    }



}