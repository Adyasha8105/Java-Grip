import java.io.*;
import java.util.*;
public class Duplicate
{
    int original_array[];
    int duplicate_array[];

    public boolean checkDuplicate(int array[], int num)
    {
        int i=0, count=0;
        int len= array.length;
        for(i=0; i<len; i++)
        {
            if(num==array[i])
            count++;
        }
       if(count>1)
          return true;
        else
          return false;
    }

    public boolean duplicate_array(int num, int duplicate_array[])
    {
        int i=0, count=0;
        int len=duplicate_array.length;

        for(i=0; i<len; i++){
            if(duplicate_array[i]==num)
            count++;
        }
        if(count==0)
          return true;
       else
          return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the total number of elements: ");
        int n= sc.nextInt();
        int p=0,i=0;
        Duplicate d= new Duplicate();
        d.original_array = new int[n];
        System.out.println("Enter the numbers: ");
        for(i=0; i<n; i++) {
            d.original_array[i]=sc.nextInt();
        }
        d.duplicate_array = new int[n];
        int dup;
        boolean check;
        for(i=0; i<n;i++)
        {   
        dup= d.original_array[i];
        check= d.checkDuplicate(d.original_array,dup);

        if(check)
        {
           boolean b= d.duplicate_array(dup,d.duplicate_array);
            if(b==true) {
             d.duplicate_array[p]=dup;
             p++;
           }
          }
        }
        System.out.println("Duplicate numbers are: ");
        for(i=0; i<(p); i++)
        System.out.println(d.duplicate_array[i]);
     }
}
