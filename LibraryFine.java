mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int charges=0;
       if(y1 < y2){
           charges = 0;
       } 
       else if(y1 == y2){
           if(m1 == m2){
                if(d1 > d2){
                    charges = 15 * (d1-d2);
                }
                else 
                    charges = 0;
            }
            else if(m1 > m2)
                charges = 500 * (m1-m2);
            else 
                charges = 0;
        }
       else 
            charges = 10000;
        System.out.println(charges);
    }
}

