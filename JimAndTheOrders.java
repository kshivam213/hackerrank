mport java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class JimAndTheOrders {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		TreeMap<Long, Long> orders=new TreeMap<Long, Long>();
		Long n=s.nextLong();
		for(Long i=(long) 1;i<=n;i++)
		{
			Long time=s.nextLong();
			Long duration=s.nextLong();
		    
			Long totalTime = time+duration;
			orders.put(totalTime, i);
		}
		
		Set<Long> keys=orders.keySet();
		for(Long key:keys){
			System.out.print(orders.get(key)+" ");
		}
	}
}
