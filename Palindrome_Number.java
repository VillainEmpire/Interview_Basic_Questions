import java.util.*;

public class Palindrome_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        boolean ans = check_Palindrome(n);
        System.out.println(ans);
    }
    public static boolean check_Palindrome(int num){
        int x = num;
        int number = 0;
        while(num>0){
            int rem = num%10;
            number*=10;
            number += rem;
            num/=10;
        }
        if(x==number){
            return true;
        }
        return false;
    }
}
