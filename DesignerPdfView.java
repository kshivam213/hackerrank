mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> points=new HashMap<Character, Integer>(); 
        for(int i=65;i<=90;i++){ 
            points.put((char)i, in.nextInt());
        }
        String word = in.next().toUpperCase();
        char[] wordsArr = word.toCharArray();
        int len=wordsArr.length,maxheight=0;
        Set<Character> keys=points.keySet();
        for(int i=0;i<len;i++){
            for(char c:keys){
                if(c == wordsArr[i]){
                    if(points.get(c) > maxheight){
                        maxheight = points.get(c);
                    }
                }
            }
        }
        System.out.println(len*maxheight);
    }
}

