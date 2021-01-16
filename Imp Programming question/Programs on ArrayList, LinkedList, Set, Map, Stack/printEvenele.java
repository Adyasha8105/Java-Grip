import java.util.*;
public class printEvenele 
{
	void  printEvenElements(ArrayList<Integer> al){
		System.out.println("All even elements in arraylist are:");
        for(int i=0;i<al.size();i++)
		{
			if(al.get(i)%2==0)
			{
				System.out.println(al.get(i));
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to store in the arraylist: ");
		int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Enter "+n+" elements: ");
		for (int i=0;i<n;i++)
		{
            al.add(sc.nextInt());
		}
		System.out.println("All elements stored in the arraylist are:");
		System.out.println(al);
		printEvenele ob=new printEvenele();
        ob.printEvenElements(al);
	}
}
