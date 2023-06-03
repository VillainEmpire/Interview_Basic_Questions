import java.util.*;

// Link of question:- https://practice.geeksforgeeks.org/problems/6bb49b563cc171335c6564b00307a6d867e0268d/1

public class Seating_Arrangement {
    public static void main(String[] args){
        int n = 2;
        int m = 7;
        int seats[] = {0, 0, 1, 0, 0, 0, 1};
        boolean ans = is_possible_to_get_seats(n, m, seats);
        System.out.println(ans);

    }
    public static boolean is_possible_to_get_seats(int count, int m, int[] seats) {
        if(m==1){
            if(seats[0]==1 && count ==0) return true;
            else if(seats[0]==0 && count==1) return true;
            else if(seats[0]==0 && count >1) return false;
        }
        for(int i=0;i<m;i++){
            if(count==0) return true;
            if(i==0){
                if(seats[i]==0 && seats[i+1]==0){
                    seats[i]= 1;
                    count--;
                }
            }
            else if(i==m-1){
                if(seats[i]==0 && seats[i-1]==0){
                    seats[i] = 1;
                    count--;
                }
            }
            else if(seats[i]==0 && seats[i-1]==0 && seats[i+1]==0){
                seats[i] =1;
                count--;
            }
        }
        if(count>0) return false;
        return true;
    }
}
