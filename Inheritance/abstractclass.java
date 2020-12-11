abstract class Base {
    Base() { System.out.println("Base constructor is called");}
  abstract void fun();
}

class Derived extends Base {
    Derived() { 
        super();
        System.out.println("Derived constructor is called");}
    super();
    void fun(){
        System.out.println("Dervived fun() is called");
    }
}

class abstractclass{
    public static void main (String args[]){
        // Base b = new Base();
        // Base b = new Derived();
        Derived d = new Derived();
        // b.fun();
        d.fun();
    }
}