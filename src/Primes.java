public class Primes {

    public static void main(String[] args) {
        for(int n=2; n<101; n++){
            if (isPrime(n)==true)
                System.out.println(n);
        }
    }

    public static boolean isPrime(int n){
        for(int p =2; p<n; p++)
            if (n % p == 0)
                return false;
        return true;
    }
}