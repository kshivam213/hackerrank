mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int checkNumbers(int num) {
        String no=String.valueOf(num);
        char arr[]=no.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            int data = Character.getNumericValue(arr[i]);
            if(data == 0){
                continue;
            }
            if(num % data == 0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Integer> al=new ArrayList<Integer>();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            al.add(checkNumbers(n));
        }
        for(int i:al){
            System.out.println(i);
        }
    }
}

