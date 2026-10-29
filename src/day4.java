public class day4 {
    static int sum(int n1,int n2){return n1+n2;}
    static boolean isEven(int n){boolean result;

        if (n % 2 == 0) {
            result = true;
        } else {
            result = false;
        } return result; }
    static  int maxOfThree(int n1, int n2,int n3){
        int max=0;
        if ( n1>=n2){
            if(n1>=n3){
                max=n1;
            }else{
                max=n3;
            }

        }else{if(n2>=n3){
            max=n2;
        }else{
            max=n3;
        }

        }
        return max;
    }
    static  int factorial(int n){
        int fac=1;
        for(int i=n;i>0;--i){
            fac=i*fac;
        }
        return fac;
    }
    static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }

        for (int i = n - 1; i > 1; --i) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
