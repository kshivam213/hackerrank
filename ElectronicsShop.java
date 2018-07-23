import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int total = 0;
		Integer[] keyboards = new Integer[n];
		for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
			keyboards[keyboards_i] = in.nextInt();
		}
		int[] drives = new int[m];
		for (int drives_i = 0; drives_i < m; drives_i++) {
			drives[drives_i] = in.nextInt();
		}
		Arrays.sort(keyboards, Collections.reverseOrder());
		Arrays.sort(drives);
		int max = -1;
        for(int i = 0, j = 0; i < n; i++){
            for(; j < m; j++){
                if(keyboards[i]+drives[j] > s) break; 
                if(keyboards[i]+drives[j] > max)
                    max = keyboards[i]+drives[j];
            }
        }
        System.out.println(max);
		
	}
}
