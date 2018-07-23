mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count=0,i=0; 
        String so= "SOS";
       int len=s.length();
        while(i<len){  
                if(s.charAt(i) != so.charAt(i%3))
                    count++;
            i++;
        }
        System.out.println(count);
    }
}

