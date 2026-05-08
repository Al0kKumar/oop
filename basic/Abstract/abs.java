package basic.Abstract;


interface Bird {

    void fly();

    void eat();
}

class Sparrow implements Bird{

    public void fly(){
        System.out.println("Sparrow is flying");
    }

    public void eat(){
        System.out.println("Sparrow is Eating");
    }
}

public class abs {
    

    public static void main(String[] args){

        Bird b = new Sparrow();
        b.eat();
        b.fly();

    }
}
