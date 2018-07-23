mport java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in); 
        int n=s.nextInt();
        long b=s.nextLong();
        long price[]=new long[n];
        for(int i=0;i<n;i++)
            price[i]=s.nextLong();
        int count=0;
        long tot=0;
        Arrays.sort(price); 
        for(int i=0;i<n;i++)
            {
                tot=tot+price[i];
                if(tot < b)
                {
                count++;
                }
        }
        System.out.println(count);
    }
}
