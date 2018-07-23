mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int max=0;
        for(int height_i=0; height_i < n; height_i++){
            int heightInput= in.nextInt();
            height[height_i] = heightInput;
            if(heightInput > max)
                max=heightInput;
        }
        if(max > k) 
            System.out.println(max-k);
        else
            System.out.println("0");
    }
}

