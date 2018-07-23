mport java.util.*;

public class kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
    	
    	int i=0;
    	 if(v1<=10000 && v2 <=10000 && x1 <=10000  && x2 <=10000){
    		while(i<10000)
    		{
    			x1=x1+v1;
    			x2=x2+v2;
    			if(x1 == x2)
    			{
    				return "YES";
    			}
    			i++;
    		}
    	 }
    	 else
    		 return "";
		return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}

