mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

	static boolean checkDivides(int a, int []arr)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(!((arr[j]%a)==0))
			{
				return false;
			}
		}
		return true;
	}
	static boolean checkDivisible(int a, int arr[])
	{
			for(int j=0;j<arr.length;j++)
			{
				if(!((a%arr[j])==0))
				{
					return false;
				}
			}
		return true;
	}
    static int getTotalX(int[] a, int[] b) {
    	boolean flag=true,flag1=true;
    	int count=0;
    	int end=b[b.length-1];
    	
    	for(int i=a[0];i<=end;i++)
    	{
    		flag=checkDivisible(i, a);
    		flag1=checkDivides(i, b);
    		
    		if(flag && flag1)
    		{
    			count++;
    		}
    	}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}

