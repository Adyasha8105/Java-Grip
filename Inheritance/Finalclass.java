//Compilation error  
//error: cannot inherit from final Bike
// class Hondal extends Bike{
//     ^
// 1 error
final class Bike{}

class Hondal extends Bike{
    void run(){
        System.out.println("Running safely");
    }
}

final class Finalclass{
    public static void main (String args[]){
        Hondal honda = new Hondal();
        honda.run();
    }
}
