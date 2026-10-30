import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    int n ,max,min;
    int[] arr, MaMi;
    String s ;
    s=new String("");
    System.out.print(palindrom(s,scanner));
    arr=new int[10];
    MaMi =new int[2];
//   MaMi= maxMin(arr,scanner);

//   System.out.println(MaMi[0]);
//    System.out.println(MaMi[1]);
//    System.out.println(Average(arr,scanner));






}




    static int [] maxMin(int []arr,Scanner scanner ){
        int n ,max,min;
        int [] MaMi;
        MaMi=new  int [2];
        for(int i=0;i<arr.length;i++){
            System.out.print("inter the number " +(i+1)+ " :");
            arr[i]=scanner.nextInt();
        }
        max=arr[0];
        min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }

        }
        MaMi[0]=max;
        MaMi[1]=min;
        return MaMi;
    }
    static int  Average(int []arr,Scanner scanner ){
        int average ,sum ;
        sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.print("inter the number " +(i+1)+ " :");
           arr[i]=scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++){

         sum += arr[i] ;
        }
        average=sum/ arr.length;

return average;}
    static String rever(String s, Scanner scanner){
    System.out.print("inter the string ");
    s=scanner.nextLine();
    String res="";
    for(int i=s.length()-1;i>=0;i--){
        res+=s.charAt(i);
    }
    return res;
    }
    static  int  vowels(String s, Scanner scanner){
        System.out.print("inter the string ");
        s=scanner.nextLine();
        int count =0;
        String vol="aeiou";
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (vol.contains("" + s.charAt(i))) {
                count++;
            }
        }
return count;
    }
    static boolean palindrom(String s, Scanner scanner) {
        System.out.print("inter the string ");
        s=scanner.nextLine();
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
      System.out.println(s);
        System.out.println(res);

        return s.equalsIgnoreCase(res);
    }
    static HashMap<Character, Integer> frequent(String s, Scanner scanner) {
        System.out.print("Enter the string: ");

        HashMap<Character, Integer> hash = new HashMap<>();

        s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (hash.containsKey(ch)) {
                hash.put(ch, hash.get(ch) + 1);
            } else {
                hash.put(ch, 1);
            }
        }

        return hash;
    }




}