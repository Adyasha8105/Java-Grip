import java.util.*;
public class Comparell 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to store in the 1st Linkedlist: ");
		int n1=sc.nextInt();
		System.out.println("Enter number of elements to store in the 2nd Linkedlist: ");
		int n2=sc.nextInt();
		LinkedList<Integer> ll1=new LinkedList<Integer>();
		System.out.println("Enter "+n1+" elements: ");
		for (int i=0;i<n1;i++)
		{
            ll1.add(sc.nextInt());
		}
		LinkedList<Integer> ll2=new LinkedList<Integer>();
		System.out.println("Enter "+n2+" elements: ");
		for (int i=0;i<n2;i++)
		{
            ll2.add(sc.nextInt());
		}
		System.out.println("All elements stored in the 1st Linkedlist are:");
		System.out.println(ll1);
		System.out.println("All elements stored in the 2nd Linkedlist are:");
		System.out.println(ll2);
		LinkedList<String> ll3 = new LinkedList<String>();
          for (Integer n : ll1)
             ll3.add(ll2.contains(n) ? "Yes" : "No");
          System.out.println(ll3);
	}
}
