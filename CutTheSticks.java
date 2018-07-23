mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {

	public static int findmin(ArrayList<Integer> array) {
		int min = 0;
		for (int i = 0; i < array.size(); i++) {
			if (i == 0)
				min = array.get(i);
			else {
				if (array.get(i) < min)
					min = array.get(i);
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0, size = 0;
		ArrayList<Integer> allList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			allList.add(in.nextInt());
		}
		size = allList.size();
		while (size > 0) {
			int min = findmin(allList);
			count = 0;
			for (int i = 0; i < allList.size(); i++) {
				int data = allList.get(i);
				data = data - min;
				allList.set(i, data);
				count++;
			}
			int j=0;
			while(j<allList.size()){
				if (allList.get(j) == 0) {
					allList.remove(j);
					size--;
				}
				else
					j++;
			}
			System.out.println(count);
		}
	}
}

