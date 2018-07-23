mport java.util.ArrayList;
import java.util.Scanner;

public class HRankSparse {
	
	public static void main(String args[]){
	    ArrayList<String> list = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i < n; i++) {
            list.add(s.next());
        }
        int q = s.nextInt();
        for(int i = 0; i < q; i++) {
            int count = 0; 
            String query = s.next(); 
            for(String str : list) {
                if(str.equals(query))
                    count++;
            }
            System.out.println(count);
        }
    }
}

