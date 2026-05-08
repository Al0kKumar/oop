package basic.Abstract;

import java.util.concurrent.BrokenBarrierException;

abstract class Bird {

    abstract void fly();

    abstract void eat();

    void sleep(){
        System.out.println("Sleeping...");
    }
    
}

class Sparrow extends Bird{

    @Override
    void fly(){
        System.out.println("Sparrow flying");
    }

    @Override
    void eat(){
        System.out.println("Sparrow eating");
    }
}

public class Main {
    
    public static void main(String[] args){

        Bird b = new Sparrow();
        
        b.eat();
        b.fly();
        b.sleep();
    }
}
