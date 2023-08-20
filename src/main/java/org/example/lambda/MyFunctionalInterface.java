package org.example.lambda;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String msg);

    //void display (String msg)  // defining the another abstract function definition will give you an error as we have applied the @FunctionalInterface annotation.
    // function interface can have any number of default and static methods defined
    // but its should only contain one abstract method
    default void m1(){
        System.out.println("m1 default");
    }
    static void m2(){
        System.out.println("m2 static");
    }
}
