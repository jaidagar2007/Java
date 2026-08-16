public class PrimeNumber {
    public static void prime(int n){
        if(n<0){
            n = -n;
        }
        for(int i = 2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("It is not a prime number");
                return;
            }
        }
        System.out.println("It is a prime number");
    }
}
