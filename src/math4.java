import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class math4 {
    public static void main(String[] args) {
        int n = 20;
//        for (int i = 1; i <= n; i++) {             //  O(n)
//            System.out.println(i + "     " + isPrime(i));
//        }

        System.out.println(prime(n));

        boolean isPrime[] = sieveofEratoshtenes(40);
        for (int i = 0 ; i <= 40 ; i++){
            System.out.println( i + "  "+ isPrime[i]);
        }
    }

//----------------------------------------------------------------------------------------------------------------------------------
//    static boolean isPrime(int no) {
//        if (no <= 1) {
//            return false;
//        }
//        int c = 2;
//        while (c * c <= no) {
//            if (no % c == 0) {
//                return false;
//            }
//            c++;
//        }
//        return true;
//    }
//--------------------------------------------------------------------------------------------------------------------------------
    static boolean prime(int no) {       //O(sqrt(n))
        if (no <= 1) {                       //TOTAL COMPLEXITY O(N*SQRT(N))
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(no)) {
            if (i % no == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
//--------------------------------------------------------------------------------------------------------------------------------
    //false in array means prime
    //SEIVE OF ERATOSTHENES
    static void sieve(int n, boolean[]primes){
        for (int i = 2 ; i * i <= n ;i ++){
            if(!primes[i]){
                for (int j = i*2; j <=n ; j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i = 2; i <=n ; i++){
            if(!primes[i]){
                System.out.println(i + "  ");
            }
        }
    }
//--------------------------------------------------------------------------------------------------------------------------------
   //anuj bhaiya
    static boolean[] sieveofEratoshtenes(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);// it will make all the elements of array to true
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2 ; i * i <= n ; i++){

            for (int j = 2 * i ; j <= n; j += i){
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}
