public class commandline {
    public static void main(String[] args) {
        if(args.length>0){
        System.out.println("the command line are:");

        //printing the command line arguments
        for(String val:args)
        System.out.println(val);
        }
        else {
        System.out.println("command line not found");
        }

    }
}