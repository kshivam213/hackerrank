mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s=in.nextInt();
        int t=in.nextInt();
        
        int abeg=in.nextInt();
        int obeg=in.nextInt();
        
        int aCount=0;
        int oCount=0;
        
        int noOfa=in.nextInt();
        int noOfo=in.nextInt();
        for(int i=0;i<noOfa;i++)
        {
            int pos=in.nextInt();
            int range;
            if(pos<0)
                range=abeg+pos;
            else
                range=abeg+pos;
            
            if(range >= s  &&  range <= t)
                aCount++;
           
        }
        for(int i=0;i<noOfo;i++)
        {
            int pos=in.nextInt();
            int range;
            if(pos<0)
                range=obeg+pos;
            else
                range=obeg+pos;
            
            if(range >= s  &&  range <= t)
                oCount++;
          
        }
        System.out.println(aCount);
        System.out.println(oCount);
    }
}

