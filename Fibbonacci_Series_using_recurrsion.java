import java.util.*;

public class Fibbonacci_Series_using_recurrsion {
    public static int check_fibbonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return check_fibbonacci(n-1)+check_fibbonacci(n-2);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = check_fibbonacci( n);
        System.out.println(ans);
        sc.close();
    }
}
