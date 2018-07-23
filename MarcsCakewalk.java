mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		long total=0;
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int j=0;
		for(int i=n-1;i>=0;i--){
			total += (a[i]*Math.pow(2, j));
			j++;
		}
		System.out.println(total);
		in.close();
    }
    
}

