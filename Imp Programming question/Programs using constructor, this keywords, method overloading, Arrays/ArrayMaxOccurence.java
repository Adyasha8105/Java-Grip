import java.io.*;
import java.util.*;

public class ArrayMaxOccurence { 
    private int numbers[];
    public int findMax(int numbers[]) {
        int i=0, max=0;
        int len= numbers.length;
        while(i!= len) {
            if(numbers[i] > max)
             max = numbers[i];
             i++;
        }
        return max;
    }

    public int findOccurence(int numbers[],int max) {
        int i=0, count=0;
        int len= numbers.length;
        while(i!=len) {
            if(numbers[i]==max)
            count++;
            i++;
        }
        return count;
    }

    public void printResult() {
        int max= findMax(numbers);
        System.out.println("The Largest integer in the list: "+ max);
        System.out.println("The total number of occurences: "+ findOccurence(numbers, max));
    }

    public static void main(String[] args) {
        ArrayMaxOccurence maxoc = new ArrayMaxOccurence();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of integers you want to entered: ");
        int n= sc.nextInt();
        maxoc.numbers= new int[n];
        int i=0;
        System.out.println("Enter the integers: ");
        for(i=0; i<n;i++) {
            maxoc.numbers[i]=sc.nextInt();
        }
        maxoc.printResult();
    }
}
