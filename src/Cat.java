import java.util.Scanner;

public class Cat extends day11{
    Cat(Scanner s){
      super(s);
    }

    @Override
    public void makeSound() {
      System.out.println(super.getSound());
    }
}
