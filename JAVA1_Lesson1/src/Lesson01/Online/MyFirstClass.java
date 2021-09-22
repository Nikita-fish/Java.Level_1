package Lesson01.Online;// one-line comment

/*dsdsadas
dsadasdas
dsadasdas
 */

public class MyFirstClass {
    public static void main (String [] args){
        System.out.println("Hello Java!");
        System.out.println("Hello Hello");
        System.out.print("Hello World!");


        //целые числа
        byte myByte = 36; //1 byte <-128 .. +127>
        short myShort = 259; //2 bytes <-32768 .. +32767>
        int myInteger = 99000; // 4 bytes <-2.1mlrd .. +2.1mlrd> DEFAULT
        long myLong = 30_000_000_000L; // 8 bytes <-2^63 .. +2^63>

        //числа с точкой
        float myFloat = 15.95F; // 4 bytes <>.0000000
        double myDouble = 15.95; // 8 bytes <>.00000000000000 DEFAULT

        //char
        char myChar = 'Q'; // 2 bytes ~ Ascii/UTF-16/32

        //non-primitive type-data
        String myString = "dsadsadsada sdasdas";

        //boolean
        boolean myBooleanTrue = true;
        boolean myBooleanFalse = false;

        int abc = 20;
        if (abc > 100) {
            System.out.println("Ok!");
        } else {
            System.out.println("Fail!");
        }

        int cde = 100;

        if (cde > 150) {
            System.out.println("cde > 150");
        } else if ("cde > 90"); {
            System.out.println("cde > 90");
        } else {
            System.out.println("Fail!");
        }

        int a = 150;
        int b = 350;
        int result;

        result = a + b;
        System.out.println("Result " + result);


    }
}
