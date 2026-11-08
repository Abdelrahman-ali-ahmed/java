import java.util.Scanner;

public class DeveloperDay14 extends Employee{
    private String programminglanguage;
    private String validProgramming(Scanner s){
     String programm;
     s.nextLine();
     while (true){
         try{
             System.out.println("inter your programming language : ");
             programm=s.nextLine();
             if(programm.trim().matches("[a-zA-Z][a-zA-Z0-9+#.]*")){
                 return programm;
             }else {
                 throw new IllegalArgumentException("Enter a valid programming language !");
             }

         }catch (IllegalArgumentException e){
             System.out.println(e.getMessage());

         }


     }


   }

    DeveloperDay14(Scanner s){
        super(s);
        programminglanguage=validProgramming(s);
    }
    public String getProgramminglanguage(){
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
