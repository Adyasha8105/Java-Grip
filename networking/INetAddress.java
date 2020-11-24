import java.io.*;  
import java.net.*;  
 public class INetAddress {  
  public static void main(String[] args){  
   try{      
    InetAddress ip= InetAddress.getByName("www.nptel.ac.in");
    System.out.println("Host Name: "+ip.getHostName());
    System.out.println("IP Address: "+ip.getHostAddress());
  }
  catch(Exception e){
    System.out.println(e);
  }  
 }  
}  