package org.example.defaultstatic;

interface Vehicle{
    String getBrand();
    String speedUp();
    String slowDown();

    default String turnAlarmOn(){
        return "turn alarm on";
    }
    default String turnAlarmOff(){
        return "turn alarm off";
    }
    static String trunBlinkers(){
        return "turning the blinkers on ";
    }

}
class Car implements Vehicle{
    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String speedUp() {
        return "the car is speeding up";
    }

    @Override
    public String slowDown() {
        return "the car is slowing down";
    }
}

public class DefaultDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());

        // this demonstrates that the default methods are available for all the implementations.
        System.out.println(car.turnAlarmOff());
        System.out.println(car.turnAlarmOn());
        System.out.println(Vehicle.trunBlinkers());

    }
}
