import java.util.*;

//5. Armstrong number
// Program to verify whether a given number is an Armstrong number.

// An Armstrong number is equal to the sum of the cubes of its digits.


// Approach :-- First we calculate the no. of digits in that number using the check_length function.
            // Then we use the reverse no. appraoch to check whether a number is armstrong or not.
public class Armstrong_Number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = check_armstrong(n);
        System.out.println(ans);
        sc.close();
    }
    public static boolean check_armstrong(int num){
        int x = num;
        int newValue = x;
        int cal = check_length(newValue);
        int number = 0;
        while(num>0){
            int rem = num%10;
            number += Math.pow(rem, cal); 
            num /=10;
        }
        if(number == x){
            return true;
        }
        return false;
    }
    public static int check_length(int num){
        int count = 0;
        while(num>0){
           num = num/10;
           count++;
        }
        return count;
    }
}
