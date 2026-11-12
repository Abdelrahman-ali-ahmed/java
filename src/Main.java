import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        wordCount(scanner);


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
}