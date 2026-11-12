import java.util.Scanner;

public class Box <T>{
    T value ;
    public void setValue(T v){
        this.value=v;
    }
    public T getValue(){
       return this.value;
    }
}
