import java.io.*;
import java.util.*;

class Demo {
    public static void WrappingUnwraping() {
        // byte data type
        byte a = 1;
        // wrapping around Byte object
        Byte byteobj = new Byte(a);
        // int data type
        int b = 10;
        //wrapping around Integer object
        Integer intobj = new Integer(b);
        // float data type
        float c = 18.6f;
        // wrapping around Float object
        Float floatobj = new Float(c);
        // double data type
        double d = 250.5;
        // Wrapping around Double object
        Double doubleobj = new Double(d);
        // char data type
        char e='a';
        // wrapping around Character object
        Character charobj=e;
        // printing the values from objects
        System.out.println("Values of Wrapper objects (printing as objects)");
        System.out.println("Byte object byteobj: " + byteobj);
        System.out.println("Integer object intobj: " + intobj);
        System.out.println("Float object floatobj: " + floatobj);
        System.out.println("Double object doubleobj: " + doubleobj);
        System.out.println("Character object charobj: " + charobj);
        // objects to data types (retrieving data types from objects)
        // unwrapping objects to primitive data types
        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;
        // printing the values from data types
        System.out.println("Unwrapped values (printing as data types)");
        System.out.println("byte value : " + bv);
        System.out.println("int value : " + iv);
        System.out.println("float value : " + fv);
        System.out.println("double value : " + dv);
        System.out.println("char value : " + cv);
    }
    public static void AutoboxingUnboxing(){
// AUTOBOXING
/*Converting a primitive datatype into a question of
 the relating wrapper class is called autoboxing in Java.
 For instance, changing over int to Integer class.
*/
        System.out.println("Autoboxing example:-");
        char ch = 'a';
        // Autoboxing- primitive to Character object conversion
        Character a = ch;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);
        // printing the values from object
        System.out.println(arrayList.get(0));
 /* It is just the reverse process of autoboxing.
 Automatically converting an object of a wrapper class
 to its corresponding primitive type is known as unboxing.
 For example – conversion of Integer to int*/
        System.out.println("Unboxing example:-");
        Character char_obj = 'a';
        // unboxing - Character object to primitive conversion
        char character = char_obj;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(24);
        // unboxing because get method returns an Integer object
        int num = list.get(0);
        // printing the values from primitive data types
        System.out.println(num);
        //CONVERSION OF String TO Float AND Integer USING Wrapper classes
        System.out.println("String TO Float AND Integer USING Wrapper classes");
        String real = "2.568";
        float real_float = Float.parseFloat(real);
        System.out.println(real_float);
        String integer = "234";
        int str_to_int = Integer.parseInt(integer);
        System.out.println(str_to_int);
    }
    public static void main(String[] args) {
        System.out.println("Wrapping unwrapping examples:- ");
        WrappingUnwraping();
        System.out.println("Autoboxing Unboxing examples:- ");
        AutoboxingUnboxing();
    }
}

