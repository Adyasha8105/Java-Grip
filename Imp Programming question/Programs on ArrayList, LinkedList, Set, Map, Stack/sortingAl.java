import java.util.*;
public class sortingAl 
{
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
		System.out.println("All elements stored in the arraylist before sorting are:");
		System.out.println(al);
		Integer temp;
		for(int i=0;i<al.size()-1;i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
                if(al.get(i)>al.get(j))
				{
                    temp=al.get(i);
					al.set(i,al.get(j));
					al.set(j,temp);
				}
			}
		}
        System.out.println("The arraylist after sorting is:");
		System.out.println(al);		
	}
}
