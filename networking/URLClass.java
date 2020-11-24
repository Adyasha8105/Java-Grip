import java.io.*;  
import java.net.*;  
 public class URLClass {  
  public static void main(String[] args){  
   try{      
    URL url=new URL("https://onlinecourses.nptel.ac.in/noc20_cs58/unit?unit=80&lesson=84");
    System.out.println(url.getProtocol());
    System.out.println(url.getHost());
    System.out.println(url.getPort());
    System.out.println(url.getFile());
  }
  catch(Exception e){
    System.out.println(e);
  }  
 }  
}  