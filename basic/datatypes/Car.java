package basic.datatypes;

public class Car {
    
    private int speed;
    private String name;

    public Car(String name){
        this.name = name;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    void drive(){
        System.out.println("driving the car");
    }
    
}
