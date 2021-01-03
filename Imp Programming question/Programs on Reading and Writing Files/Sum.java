import java.io.*;
public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./read.txt"));
        String line;
        int i, sum = 0, avg, c = 0;
        while ((line = br.readLine()) != null) {
            String[] s = line.split(" ");
            for (String str: s) {
                c++;
                int a = 0;
                a = Integer.parseInt(str);
                sum += a;
            }
        }
        avg = sum / c;
        System.out.println("sum=" + sum);
        System.out.println("avg=" + avg);
    }
}