class Demo4 {
    public static void main (String args[]){
    int i = 0;
    String greetings[] = {"Hello Twinkle", "Hello Java", "Hello World"};
    while(i < 4) {
      try {
         System.out.println(greetings[i]);
         i++;
        }
       catch(Exception e) {
          System.out.println (e.toString());
       }
       finally {
           System.out.println("Hi !");
           if(i<3);
           else {System.out.println("You should quit and reset index value");
            break; }
       }
     }
  }
}
