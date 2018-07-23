mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMinimumCost(int n, int k, int[] c){
            int total = 0;
            Arrays.sort(c);
            int i = c.length-1;
            int bought = 0;
             while(i>=0){
                for(int j=0;j<k && i>=0;j++){
                    total+=(1+bought)*c[i];
                    i--;
                }
                bought++; 
             }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();   
        int[] c = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }    
        int minimumCost = getMinimumCost(n, k, c);
        System.out.println(minimumCost);
    }
}

