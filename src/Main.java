import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num =StrToNum("213")+1;
 System.out.println(num); ;
//        wordCount(scanner);
//ArrayList<Integer> arr1= new ArrayList<>();
//        arr1.add(100);
//        arr1.add(200);
//        arr1.add(300);
//ArrayList<String> arr2= new ArrayList<>();
//        arr2.add(100+"");
//        arr2.add(200+"");
//        arr2.add(300+"");
//        String [] arr3 ={"101","200","300"};
//display(arr1);
//System.out.println("------------------------------------");
//display(arr2);
//        System.out.println(displayFirst(arr1.toArray()) );
//        System.out.println(displayFirst(arr2.toArray()));;
//        System.out.println( displayFirst(arr3));;
        scanner.close();
    }

    public void duplicateNumbers(ArrayList<Integer>arr){
        HashMap<Integer, Integer> hash = new HashMap<>();

        // Count occurrences
        for (int i : arr) {
            if (hash.containsKey(i)) {
                hash.put(i, hash.get(i) + 1);
            } else {
                hash.put(i, 1);
            }
        }

        // Find duplicated numbers
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate: " + entry.getKey()
                        + " - Count: " + entry.getValue());
            }
        }
    }
    static   void wordCount2(Scanner s){
        String sentence;
        int stopPoint=0;
        System.out.println("inter sentence");
        sentence=s.nextLine().trim();
        ArrayList<String> WordsArr=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<sentence.length();i++){
 if(sentence.charAt(i)==' '){
if (sentence.substring(stopPoint,i).trim().isEmpty()){
    continue;
}else{
    WordsArr.add(sentence.substring(stopPoint,i).trim());
    stopPoint=i;}

 }else if(i==sentence.length()-1){
     WordsArr.add(sentence.substring(stopPoint,i+1).trim());
 }
        }
        for(String word: WordsArr){
            if(!map.containsKey(word.trim())){
                map.put(word.trim(),1);
            }else{
                map.put(word.trim(),map.get(word)+1);
            }
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : "  + entry.getValue());
        }

        displayinfo(WordsArr);

    }
    static void displayinfo(ArrayList<String> WordsArr){
        for(String word :WordsArr){
            System.out.println(word.replace(' ','*'));
        }
    }
    static void wordCount(Scanner s) {

        System.out.println("Enter sentence:");
        String sentence = s.nextLine().trim().toLowerCase();

        HashMap<String, Integer> map = new HashMap<>();

        if (sentence.isEmpty()) {
            System.out.println("No words entered!");
            return;
        }

        String[] words = sentence.split("\\s+");

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static <T> void display(ArrayList<T> arr){
        for(T one: arr){
            System.out.println(one);
        }
    }
    public static <T> T displayFirst (T[] arr){
        return arr[0];
    }
    public static int StrToNum (String st){
       st= st.replaceAll("\\s+", "");
        int number=0,holder,digit =0;
        for(int i=st.length()-1;i>=0;i--){

              holder= st.charAt(i)-'0';
              number+= holder * Math.pow(10,digit);
              digit++;
              System.out.println(number);
                System.out.println("-------------------");

        }
        return number;

    }


}