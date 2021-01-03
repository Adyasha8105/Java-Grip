import java.io.*;
public class Counts {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        String line;
        int c = 0, c1 = 0, c2 = 0;
        if (args.length > 0) {
            br = new BufferedReader(new FileReader(args[0]));
            while ((line = br.readLine()) != null) {
                c++;
                String[] s = line.split(" ");
                for (String str: s) {
                    c1++;
                    c2 += str.length();
                }
            }
        }
        System.out.println("lines=" + c);
        System.out.println("words=" + c1);
        System.out.println("characters=" + c2);
    }
}