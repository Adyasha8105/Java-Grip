import java.io.*;
public class Ques1 {
    void paths(File f) {
        System.out.println("path=" + f.getAbsolutePath());
    }
    void info(File f) {
        if (f.exists()) {
            System.out.print("file exists");
            System.out.println(f.canRead() ? "and can read" : "can't read");
            System.out.println(f.canWrite() ? "and can write" : "can't write");
            System.out.println(f.isAbsolute() ? "the file is absolute" : "the file is not absolute");
            System.out.println(f.isDirectory() ? "is a directory" : "not a directory");
            System.out.println(f.isFile() ? "is a file" : "not a file");
            System.out.println("last modified=" + f.lastModified());
            System.out.println("length=" + f.length());
            System.out.println("file hidden=" + f.isHidden());
        } else {
            System.out.println("file doesn't exist:");
        }
    }
    public static void main(String args[]) throws IOException {
        File fin;
        Ques1 a = new Ques1();
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                fin = new File(args[i]);
                a.paths(fin);
                a.info(fin);
            }
        } else {
            System.out.println("java filetest:");
        }
    }
}