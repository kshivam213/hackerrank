mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int totalPages = 0;
        for(int i=0;i<n;i++){
            int chpProb = sc.nextInt();
            int pgNo = totalPages+1;
            for(int j=1;j<=chpProb;j++){
                if(j==pgNo) 
                     count++;
                if(j%k==0 && j<chpProb){
                     pgNo++;
                }
            }
            totalPages=pgNo;
        }
        System.out.println(count);
    }
}
