package basic.datatypes;

public class Test {
    
    public static void main(String[] args) {

        int a = 1;   // 4 bye  
        byte b = 2;  // 1 byte , max value 127 & min val -128 to be stored
        short c = 1;  // 2 byte , max val 32767
        long d = 1;   // 8 byte


        float j = 12.1728890f;  // 7 digits

        double k = 1.182981297182712; // 15 digits

        boolean isValid = true;

        char p = 'n';

        String name = "Alok";

        String naam = new String("Alok");  // via construtor way



        // JVM stores data in 2 places - stack and heap(string pool) for eg - int goes in stack and string goes to heap 
        // understand below

        String str1 = "hello";
        String str2 = "hello";

        // as in first str1 that hello string in stored in string pool of heap, and then for all further var it's gonna point
        // to that address location for str1 and str2 not exact value

        System.out.println(str1 == str2);   // true cuz both point to same rferrence address

        String str3 = new String("hello");   // new object created in side heap but outside string pool

        System.out.println(str1 == str3);  // false (different objects)

        System.out.println(str1.equals(str3));  // true if content is equal


        String test = "tiger";

        // string classes 
        test.toUpperCase();
        test.toLowerCase();
        test.length();
        test.charAt(0);
        test.substring(0,4);


        int[] arr = new int[5]; // array defined of 5 size or 

        int[] nayaarray = {1,2,3};




        // OOPs

        Car car = new Car("something");
    //    car.name = "kuch bhi";
        car.setSpeed(120);

        car.drive();
        System.out.println(car.getSpeed());
        System.out.println("ok");

        // method overloading(compile time polymorphism) example
        Printer printer = new Printer();
        printer.print("Hello");
        printer.print(10);
        printer.print(2.98);

    }
}

class Printer{

    void print(int a){
        System.out.println("Integer is : " + a);
    }

    void print(String str){
        System.out.println("String is : " + str);
    }
     void print(double d){
        System.out.println("Double is : " + d);
     }
}


// Abtract class concept 
abstract class Animal{

    abstract void sayhello();
    abstract void saybye();
}

class Dog extends Animal{

    void sayhello(){
        System.out.println("bhow bhow!");
    }

    void saybye(){
        System.out.println("by bye !");
    }
}



interface Mobile{

    void makecall();
}

interface Music{
    void play();
}

class Smartphone implements Mobile, Music{

    public void makecall(){
        System.out.println("making the call...");
    }

    public void play(){
        System.out.println("playing music");
    }
}