import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class day13 {
private HashMap<String, ArrayList<String>> hash = new HashMap<>();
    private String getValidName(Scanner scanner) {

        while (true) {

            try {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                if (name.trim().isEmpty()) {
                    throw new IllegalArgumentException("Enter a valid name!");
                }

                return name.trim();

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

            }
        }
    }
    private String getValidNumber(Scanner scanner) {

        while (true) {

            try {
                System.out.print("Enter number: ");
                String number = scanner.nextLine();

                if (!number.matches("^01[0-9]{9}$")) {
                    throw new IllegalArgumentException(
                            "Enter a valid phone number!"
                    );
                }

                return number;

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

            }
        }
    }

public void addContact(Scanner scanner){
    String name = getValidName(scanner);
    String number = getValidNumber(scanner);
    if(hash.containsKey(name)){
        hash.get(name).add(number);
    }else{
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add(number);
        hash.put(name,numbers);
    }


}
public void displayContact(){
    for (String name : hash.keySet()) {

        System.out.println("Name: " + name);

        for (String number : hash.get(name)) {
            System.out.println("    " + number);
        }
    }
}
public void SearchByName(Scanner scanner){
    String name = getValidName(scanner);

    if (hash.containsKey(name)) {

        System.out.println("Name: " + name);

        for (String number : hash.get(name)) {
            System.out.println("    " + number);
        }

    } else {
        System.out.println("Contact does not exist");
    }

}
public  void  deleteContact(Scanner scanner){
    String name = getValidName(scanner);

    if (hash.containsKey(name)) {

        hash.remove(name);

        System.out.println("Contact deleted successfully!");

    } else {
        System.out.println("Contact does not exist");
    }

}

}
