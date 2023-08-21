package org.example.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo implements BiFunction<Integer,Integer,Integer> {
    @Override
    public  Integer apply(Integer a, Integer b) {
        return (a+b);
    }

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = new BiFunctionDemo();
        System.out.println(biFunction.apply(1,2));
        System.out.println(biFunction.apply(2,3));

        BiFunction<Integer,Integer,Integer> addition = (a,b) -> (a+b);
        System.out.println(addition.apply(10,20));

        Function<Integer,Integer> function = (number)-> (number*number);
        // first caliculate the 10+20 = 30
        // then applies function to return 30*30
        Integer num = biFunction.andThen(function).apply(10,20);
        System.out.println("num: "+num);


    }
}
