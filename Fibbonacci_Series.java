import java.util.*;

public class Fibbonacci_Series {
    public static int check_fibbonacci(int n ,int first, int second){
        int curr = 0;
        if(n==0) return first;
        else if(n==1) return second;
        else{
            for(int i=2;i<=n;i++){
                curr = first+second;
                first = second;
                second = curr;
            }
        }
        return curr;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int f0 = 0;
        int f1 = 1;
        int ans = check_fibbonacci(n, f0, f1);
        System.out.println(ans);
        
    }
}
