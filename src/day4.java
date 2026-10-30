import java.util.HashMap;
import java.util.Scanner;

public class day4 {
    static int sum(int n1,int n2){return n1+n2;}
    static boolean isEven(int n){boolean result;

        if (n % 2 == 0) {
            result = true;
        } else {
            result = false;
        } return result; }
    static  int maxOfThree(int n1, int n2,int n3){
        int max=0;
        if ( n1>=n2){
            if(n1>=n3){
                max=n1;
            }else{
                max=n3;
            }

        }else{if(n2>=n3){
            max=n2;
        }else{
            max=n3;
        }

        }
        return max;
    }
    static  int factorial(int n){
        int fac=1;
        for(int i=n;i>0;--i){
            fac=i*fac;
        }
        return fac;
    }
    static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }

        for (int i = n - 1; i > 1; --i) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
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
