import java.util.Scanner;

public class DeveloperDay14 extends Employee{
    private String programminglanguage;
    private String validProgramming(Scanner s){
     String programm;
     s.nextLine();
     System.out.println("inter your programming language : ");
     programm=s.nextLine();
     while (!programm.matches("[a-zA-Z]+")){
         System.out.println("inter your programming language : ");
         programm=s.nextLine();
     }
     return programm;

   }

    DeveloperDay14(Scanner s){
        super(s);
        programminglanguage=validProgramming(s);
    }
    public String getProgramminglanguage(){
        System.out.println("programming language : "+ programminglanguage);
        return programminglanguage;
    }
    public void setProgramminglanguage(Scanner s){
        programminglanguage=validProgramming(s);
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("programming language: " +programminglanguage);
    }




}
