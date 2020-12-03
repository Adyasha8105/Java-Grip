import java.io.*;

public class checkfile {
    public static void getPaths (File f) throws IOException{
        System.out.println("Name: "+ f.getName());
        System.out.println("Path: "+ f.getPath());
        System.out.println("Parent:"+ f.getParent());
    }
    public static void getInfo (File f) throws IOException{
        if(f.exists()){
        System.out.print("File exists");
        System.out.println(f.canRead() ? "and is readable" : "" );
        System.out.println(f.canWrite() ? "and is writeable" : "" );
        System.out.println("File is last modified:" + f.lastModified() );
        System.out.println("File is"+ f.length()+ "bytes");
        }
        else
        System.err.println("File does not exist.");
    }


   public static void main(String args[]) throws IOException {
        File fileToCheck;
        if(args.length > 0){
          for(int i = 0; i<args.length;i++){
              fileToCheck = new File(args[i]);
              getPaths(fileToCheck);
              getInfo(fileToCheck);
          }
        }
        else 
          System.out.println("Usuage : java file test");
        
    }
}