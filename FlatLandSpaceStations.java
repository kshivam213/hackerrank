
import java.util.*;

public class Flatland {

    static int flatlandSpaceStations(int n, int[] c) {
       int max = Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
           int mini = Integer.MAX_VALUE,temp;
             for(int j=0;j<c.length;j++){
                  temp = Math.abs(i - c[j]);
                  if(temp < mini)
                      mini = temp;
             }
           if(mini > max)
               max = mini;
       }
       return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        for(int c_i = 0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = flatlandSpaceStations(n, c);
        System.out.println(result);
        in.close();
    }
}

