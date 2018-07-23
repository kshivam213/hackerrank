mport java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int weight[]=new int[n];
        for(int i=0;i<n;i++)
            weight[i]=s.nextInt();
        
       
        Arrays.sort(weight);
         int units=1,wght=weight[0];
        for(int i=0;i<n;i++)
            {
                if(weight[i]>wght+4)
                    {
                    units++;
                    wght=weight[i];
                    }
            }
        System.out.println(units);
    }
}
