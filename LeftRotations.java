mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRankRot {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int temp[]=new int[d];
        int[] arr = new int[n];
        int i=0;
        for(int a_i = 0; a_i < n; a_i++){
            arr[a_i] = in.nextInt();
            if(i<d){
            	temp[i]=arr[a_i];
            	i++;
            }
        }
        
        for(int j=0;j<n;j++){
	    	if(j+d<n){
	    		arr[j]=arr[j+d];
	    	}
	    }
	  for(int j=n-d,k=0;j<n;j++,k++){
		  arr[j]=temp[k];
	  }
	  for(int k=0;k<n;k++){
		  System.out.print(arr[k]+" ");
	  }
    }
}

