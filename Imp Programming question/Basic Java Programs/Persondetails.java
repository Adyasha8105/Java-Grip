import java.util.*;
import java.io.*;

class Person {
    String name;
    String email;
    String phoneNumber;
    static int personCount=0;

    Person(String name, String email, String phoneNumber)
    {
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        personCount= printPersonCounter();
    }

    public static int printPersonCounter()
    {
        personCount= personCount+1;
        return personCount;
    }
}
public class Persondetails{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Person p = null;
        int ch=1;
        while(ch==1)
        {
            System.out.print("Enter 1 to create an object else Enter 0: ");
            ch=sc.nextInt();
            sc.nextLine();
            if(ch==1)
            {
                System.out.println("Enter name:");
                String name=sc.nextLine();
                
                System.out.println("Enter e-mail ID:");
                String eml=sc.nextLine();
                
                System.out.println("Enter phone no.:");
                String ph=sc.nextLine();
                
                 p= new Person(name,eml,ph);
            }
       }
        
       System.out.println("Number of objects created= "+ p.personCount);
    }
}