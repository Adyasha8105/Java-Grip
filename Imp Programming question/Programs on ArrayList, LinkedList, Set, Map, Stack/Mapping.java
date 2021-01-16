import java.util.*;
public class Mapping 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to store in the Hashmap: ");
		int n=sc.nextInt();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		System.out.println("Enter "+n+" elements and their index: ");
		for (int i=0;i<n;i++)
		{
			Integer a=sc.nextInt();
			String s=sc.next();
            hm.put(a,s);
		}
		System.out.println("All elements stored in the Hashmap are:");
		System.out.println(hm);	
		System.out.println("Enter the element to test mapping for the specified key:");
        Integer test=sc.nextInt();
		if (hm.containsKey(test))
		{
			System.out.println("Yes... "+hm.get(test));
		}
		else
		{
			System.out.println("No... ");
		}
	}
}
