import java.io.*;
import java.util.*;

public class linearSearch {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int i, n, value;
        System.out.print("Enter no. of elements you want in array: ");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the value:");
        value= s.nextInt();

 
       for (i=0 ;i < n; i++){
          if(arr[i]==value){
            System.out.println("Element found index is: "+ i);
            break;
          }
        }
        if(i==n){
            System.out.println("Element not found");
        }
    }
 }