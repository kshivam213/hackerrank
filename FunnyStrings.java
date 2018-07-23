mport java.util.*;

public class FunnyString {

	static int checkDifference(char b, char a)
	{
		int bValue=(int)b;
		int aValue=(int)a;
		
		return bValue-aValue;
	}
    static String funnyString(String s){
        String reverseString=new StringBuilder(s).reverse().toString();
        for(int i=1,j=0;i<s.length();i++,j++)
        {
        	int len=checkDifference(s.charAt(i), s.charAt(j));
        	int len1=checkDifference(reverseString.charAt(i), reverseString.charAt(j));
        	
        	if(Math.abs(len)!=Math.abs(len1))
        		return "Not Funny";
        }
        return "Funny";
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
