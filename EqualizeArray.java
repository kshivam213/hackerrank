mport java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> alldata=new ArrayList<Integer>();
        for(int i=0;i<n;i++)    
            alldata.add(s.nextInt());
        HashSet<Integer> hs=new HashSet<Integer>(alldata);
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(Integer i : hs)
             res.add(Collections.frequency(alldata,i));
        System.out.println(n-Collections.max(res,null));
    }
}
