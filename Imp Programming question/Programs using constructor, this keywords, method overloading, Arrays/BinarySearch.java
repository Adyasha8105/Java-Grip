import java.io.*;
import java.util.*;
class BinarySearch {
   public static void main(String args[]) {
      int i, n, item, arr[], first, last, middle;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      n = s.nextInt(); 
 
      arr = new int[n];
      System.out.println("Enter the elements");
       for (i=0; i<n; i++) {
          arr[i] = s.nextInt();
      }
 
      System.out.println("Enter the search value:");
      item = s.nextInt();
 
      first = 0;
      last = n - 1;
      middle = (first + last)/2;
 
      while( first <= last ) {
         if ( arr[middle] < item )
           first = middle + 1;
         else if ( arr[middle] == item ) {
           System.out.println(item + " found at location " + (middle + 1) + ".");
           break;
         }
         else
         { last = middle - 1; }
         middle = (first + last)/2;
      }
      if ( first > last )
          System.out.println(item + " is not found.\n");
   }
}
