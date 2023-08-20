package org.example.lambda;



interface Shape{
    void draw();
}


class Rectangle implements  Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle draw");
    }
}
class Circle implements  Shape{
    @Override
    public void draw() {
        System.out.println("circle draw");
    }
}
class square implements Shape{
    @Override
    public void draw() {
        System.out.println("square draw");
    }
}


public class LambdaExample {
    public static void main(String[] args) {

        // with out using lambda functions
        Shape rectangleOld = new Rectangle();
        rectangleOld.draw();


        // using lambda functions
        Shape rectangle = () -> {
            System.out.println("rectangle draw");
        };
        rectangle.draw();

        Shape square = () -> {
            System.out.println("square draw");
        };
        square.draw();

        Shape circle = () -> {
            System.out.println("circle draw");
        };
        circle.draw();


    }

}
