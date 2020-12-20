
// public class loops {
//     public static void main(String[] args) {
//         int count=1;
//         System.out.printf("Printing first 10 numbers"); 
//         while(count< 11){
//         System.out.printf(" "+((2*count)-1)); 
//         count++;
//         }

//     }
// }

// public class loops {
//     public static void main(String[] args) {
//         int count=1;
//         System.out.printf("Printing first 10 numbers"); 
//         do{
//         System.out.printf(" "+((2*count)-1)); 
//         count++;
//         }while(count< 11);

//     }
// }

// public class loops {
//     public static void main(String[] args) {
//         int count=1;
//         for(int i=1; i<11;i++){
//         System.out.println("count is" + i); 
//         }
//     }
// }

// public class loops {
//     public static void main(String[] args) {
//         for(int i=0; i<10;i++){
//         System.out.print(i + " "); 
//         if(i%2==0) continue;
//         System.out.println(" ");
//         }
//     }
// }

public class loops {
    public static void main(String[] args) {
        for(int i=1; ;i++){
        if(i%10==0) break;
        System.out.println("i:" + i); 
        }
        System.out.println("loop complete"); 
    }
}

