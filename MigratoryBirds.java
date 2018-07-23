mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int migratoryBirds(int n, int[] ar) {
        int arr[] = new int[n];
        for(int i = 0; i < n ; i++ )
        arr[ar[i]]++; 
        int max = 0,maxpos=0;
        for(int i = 0 ; i < n ; i++)
            {
            if(arr[i] > max)
                {
                max = arr[i];
                maxpos = i;
            }
        }
        return maxpos;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        } 
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}

