import java.util.Scanner;

public class Developer extends day10{
    private String programminglanguage;
    Developer(Scanner s) {
        super(s);
        s.nextLine();
        System.out.println("inter your programming language : ");
        programminglanguage=s.nextLine();
        while (!programminglanguage.matches("[a-zA-Z]+")){
            System.out.println("inter your programming language : ");
            programminglanguage=s.nextLine();
        }
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("your programing language : " +programminglanguage);
    }
}
