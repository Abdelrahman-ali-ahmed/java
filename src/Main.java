import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
  int [] arr={2, 3, 4, 5, 7, 8};
//        findSeconed(arr);
//        Checkanagrams(scanner);
//        dublicatedInArray(arr);
//checkPalindrome("madam");
        missingNumber(arr);

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
    static String reverseString (String st){
        String rev="";
        for(int i=st.length()-1;i>=0;i--){
            rev+=st.charAt(i);
        }
        return rev;
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
    public  static <T>  void dublicatedInArray(T[] arr){
        HashMap<T,Integer>map=new HashMap<>();
        for (T element:arr){
            if(map.containsKey(element)){
                map.put(element,map.get(element)+1);
            }else{
                map.put(element,1);
            }
        }
        for (Map.Entry<T, Integer> entry : map.entrySet()) {
            if (entry.getValue() >1 ) {
                System.out.println(entry.getKey());
            }
        }

    }
    public  static void checkPalindrome(String st){
        String rev=reverseString(st);
        System.out.println(rev.equals(st)?"this word is palindrome.":"this word is not palindrome.");
    }
   public  static void missingNumber(int [] arr ){
        Integer[]diff =new Integer[arr.length-1];
        int n,l;

        for(int i=0;i<diff.length;i++){
            diff[i]=arr[i+1]-arr[i];
        }
        for (int d:diff){
            System.out.println(d);
        }

 }


}