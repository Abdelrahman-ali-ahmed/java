public class PayPalPayment  implements Payment {
    public void pay(double amount){
        System.out.println("PayPalPayment" +amount);
    }
}
