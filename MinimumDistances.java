mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((A[i] == A[j]) && (i!=j)){
                    int diff = j-i;
                    list.add(diff);
                    break;
                }
            }
        }
        
        if(list.size() >0){
              Collections.sort(list);
              System.out.println(list.get(0));
        }
        else 
            System.out.println("-1");
    }
}

