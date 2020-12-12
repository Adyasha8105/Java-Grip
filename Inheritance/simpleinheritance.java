class A{
    int i,j;
    void show(){
        System.out.println("i and j:"+i+" "+j);
    }
}

class B extends A{
    int k;
    void show(){
        System.out.println("k:"+k);
    }
    void sum(){
        System.out.println("i+j+k:"+(i+j+k));
    }
}

class simpleinheritance{
    public static void main(String args[]){
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of Superob: ");
        superOb.show();
        subOb.i = 10;
        subOb.j = 20;
        subOb.k = 30;
        System.out.println("Contents of Subob: ");
        subOb.show(); 
        System.out.println("sum: ");
        subOb.sum(); 

    }
}