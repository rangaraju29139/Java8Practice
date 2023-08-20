package org.example.functional;


import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {


        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("hey i am using the consumer functional interface just to print the String");
    }





}
