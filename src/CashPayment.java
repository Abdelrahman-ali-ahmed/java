public class CashPayment  implements Payment  {
    public void pay(double amount){
        System.out.println("CashPayment" + amount);
    }
}
