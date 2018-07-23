mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoString {

    static String twoStrings(String s1, String s2){
        
    	char[] chars = s1.toCharArray();
    	Set<Character> charSet = new LinkedHashSet<Character>();
    	for (char c : chars) {
    	    charSet.add(c);
    	}
    	StringBuilder sb = new StringBuilder();
    	for (Character character : charSet) {
    	    sb.append(character);
    	}
    	String temp=sb.toString();
    	for(int i=0;i<temp.length();i++)
    	{
    		if(i+1 < temp.length()){
    		if(s2.contains(temp.substring(i, i+1))){
    			return "YES";
    		}
    	  }
    	}
    	return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}

