import java.util.Scanner;

public class day3 {
    public static void day3(String []arges){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<=50;i++){
            System.out.println("the number is "+i);
        }
        ////////////////////////
        for(int i=0;i<=50;i++){
            if(i%2==0)
            {System.out.println("the number is "+i);}
        }
        ////////////////////////////////
        int sum=0,n;
        System.out.print("inter the number ");
        n= scanner.nextInt();

        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.print("The sum is : " +sum);
        //////////////////////////////////////
        System.out.print("inter the number ");
        n= scanner.nextInt();

        for(int i=0;i<=12;i++){
            System.out.println(i+" * "+ n +" = "+n*i);
        }
        /////////////////////////////////////////////
        int  mult =1;
        System.out.print("inter the number ");
        n= scanner.nextInt();
        if (n>0){
            for(int i=n;i>0;i--){
                mult=i * mult;
            }

        }else{
            System.out.println("inter valid number ");
        }
        System.out.print("the number : " +mult);
        //////////////////////////////
        int count =0;
        System.out.print("inter the number ");
        n= scanner.nextInt();
        if (n>0){
            while(n>0){
                count++;
                n=n/10;
            }

        }else{
            System.out.println("inter valid number ");
        }

    }
}
