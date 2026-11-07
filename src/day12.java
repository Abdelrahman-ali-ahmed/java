interface Payment{
    void pay(double amount) ;
}
public class day12  implements Payment{
  public void pay(double amount){
    System.out.println("CreditCardPayment" +amount);
    }
}

