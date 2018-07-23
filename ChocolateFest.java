mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int  counter=0;
            int tchoc=n/c;
            int temp=tchoc;
                while(temp >=m){
                     temp=temp-m;
                     tchoc++;
                     temp++;
                }
            System.out.println(tchoc);
        }
    }
}

