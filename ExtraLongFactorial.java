mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static BigInteger factorial(int n){
           BigInteger f=new BigInteger("1");
           for(int i=1;i<=n;i++){ 
               f=f.multiply(BigInteger.valueOf(i));
           }
        return f;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
}

