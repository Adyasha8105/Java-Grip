import java.util.*;
class InputMismatchException2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
        int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		System.out.println("Enter the Elements to store in array");
		try {
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			for(int j=0;j<arr.length;j++) {
				sum=sum+arr[j];
            }
            System.out.println("Sum of Elements is "+ sum); 
		}
		catch (Exception e)	{
			System.out.println("You entered bad data.");
		}
	}
}
