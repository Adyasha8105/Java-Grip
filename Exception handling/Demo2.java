class Demo2 {
    public static void main (String args[]){
    
      try{
        int i= args.length;
        String myString[] = new String[i];
        myString[0]=args[0];

        if(args[0].equals("Java")){
            System.out.println("First word is Java !");
        }

        System.out.println("No. of agruments :" + i);
        int x = 12/i;
        int y[]= {555, 999};
        y[i] = x;
      }

      catch(ArithmeticException e){
          System.out.println ("Div by 0 :"+ e);
      }
      catch(NullPointerException e){
          System.out.println("A null pointer");
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index OOP :" +e);
      }

    }
}