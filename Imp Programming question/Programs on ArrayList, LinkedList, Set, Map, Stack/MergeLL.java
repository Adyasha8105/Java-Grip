import java.util.*;
public class MergeLL 
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
        LinkedList<Integer> ll3=new LinkedList<Integer>();
	    for (int i=0;i<ll1.size();i++)
		{
            ll3.add(ll1.get(i));
		}
		for (int i=0;i<ll2.size();i++)
		{
            ll3.add(ll2.get(i));
		}
        System.out.println("After merging 2 linkedlist:");
		System.out.println(ll3);
	}
}
