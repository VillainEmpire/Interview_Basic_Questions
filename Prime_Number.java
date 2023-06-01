import java.util.*;

// Question: - Count the prime numbers from 0 to n.

//Approach :- If a number is not a multiple of 2 and 3 and 5, then it is a prime number.
public class Prime_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = check_prime(n);
        System.out.println(total);

    }
    public static int check_prime(int n){
        boolean [] seen = new boolean[n];
        int count = 0;
        for(int i=2;i<n;i++){
            if(seen[i]==false) count++;
            for(int j =i*i;j<n;j+=i){
                seen[j] = true;
            }
        }
        return count;
    }

}
