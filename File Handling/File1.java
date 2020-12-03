import java.io.*;

class File1{
    public static void main(String args[]){
        double principalAmount=0.0;
        double rateOfIntrest=0.0;
        int numberOfYears=0;
        try{
            DataInputStream in = new DataInputStream(System.in);
            String tempString;
            
            System.out.print("Enter Principal Amount");
            System.out.flush();
            tempString=in.readLine();
            principalAmount = Float.valueOf(tempString);

            System.out.print("Enter rate of intrest");
            System.out.flush();
            tempString=in.readLine();
            rateOfIntrest = Float.valueOf(tempString);

            System.out.print("Enter Number of Year");
            System.out.flush();
            tempString=in.readLine();
            numberOfYears = Integer.parseInt(tempString);
        }
        catch (Exception e){
           System.out.println("Exception"+ e.getMessage());
        }

        double intrestTotal = principalAmount+rateOfIntrest+numberOfYears;
        System.out.println("Total Intrest = "+ intrestTotal);
    }
}