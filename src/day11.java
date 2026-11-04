import java.util.Scanner;

public class day11 {
    private String sound;
    private int age;
  private   String name;
 day11(Scanner s){
    System.out.println(" inter animal name : ");
    name=s.nextLine();
    System.out.println(name.matches("[a-zA-Z]+"));
    while (name.trim().isEmpty()|| !name.matches("[a-zA-Z]+")){
        System.out.println(" inter animal name : ");
        name=s.nextLine();
    }
    System.out.println(" inter animal Sound : ");
    sound=s.nextLine();
    while (sound.trim().isEmpty()||! sound.matches("[a-zA-Z]+")){
        System.out.println(" inter animal sound : ");
        sound=s.nextLine();
    }
    System.out.println(" inter animal name : ");
    age=s.nextInt();
    while (age<=0){
        System.out.println(" inter animal age : ");
        age=s.nextInt();
    }
}
  public void makeSound(){};
 public String getSound(){
     return sound;
 }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
