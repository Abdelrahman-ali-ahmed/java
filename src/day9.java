import java.util.Scanner;

public class day9 {
    private String accountNumber="";
    private double balance;
    private Scanner s=new Scanner(System.in);
    day9(){
        while(accountNumber.length() <= 9){
            System.out.print("Enter account number: ");
            this.accountNumber = s.nextLine();
        }
    }
    public void deposit(double amount){
        while(amount<=0){
            System.out.print("Enter deposit: ");
            amount=s.nextDouble();
        }
        balance+=amount;
        System.out.println("Mission successful");
    }
    public void withdraw(double amount){
        while(amount<=0 || amount>balance){
            System.out.print("Enter valid withdrawal amount: ");
            amount=s.nextDouble();
        }

        balance-=amount;
        System.out.println("Mission successful");
    }
    public void getBalance(){
        System.out.println("your balance is : " + balance);
    }

}
