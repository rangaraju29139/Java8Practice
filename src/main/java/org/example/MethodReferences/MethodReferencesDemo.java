package org.example.MethodReferences;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface  Printable{
    void print(String msg);
}
public class MethodReferencesDemo {
    public void display(String msg){
        System.out.println(msg);
    }
    public static int addition(int a,int b){
        return (a+b);
    }
    public static void main(String[] args) {
        // 1. Method reference to a static method
        Function<Integer,Double> function = (input) ->  Math.sqrt(input);
        System.out.println(function.apply(2));

        // using the method reference
        Function<Integer,Double> functionMethodReference = Math::sqrt;
        System.out.println(functionMethodReference.apply(2));

        // lambda expression to call the Static method

        BiFunction<Integer,Integer,Integer> biFunctionLambda1 = (a,b) -> MethodReferencesDemo.addition(a,b);
        System.out.println(biFunctionLambda1.apply(2,3));



        // Method references to call the static methods
        BiFunction<Integer,Integer,Integer> biFunctionLambda = MethodReferencesDemo::addition;
        System.out.println(biFunctionLambda.apply(2,3));



        // Method references to an instance method
        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();

        //lambda expression

        Printable printable = (msg)-> methodReferencesDemo.display(msg);
        printable.print("Hello there! i am printinig from the printable");


        // using method reference
        Printable prinableMethodReference = methodReferencesDemo::display;
        prinableMethodReference.print("Hello there! i am printinig from the pritableMethodReference");

        // reference to an instance method of an arbitary object
        // some time we call a method of argument in the lambda expression.
        // In that case , we can use a method reference to call an instance method of a specific type.
        Function<String,String> stringFunction  = (String input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("hello calling a instance method of a specific type of argument"));

      // using the method reference
        Function<String,String> stringFunctionMethodReference  = String::toLowerCase;
        System.out.println(stringFunctionMethodReference.apply("hello calling a instance method of a specific type of argument"));


        // using the lambda Expression
        String[] strArray = {"A","B","C","D","E","F"};
        Arrays.sort(strArray,(s1,s2) -> s1.compareToIgnoreCase(s2));


        //using the method references
        Arrays.sort(strArray,String::compareToIgnoreCase);

        // reference to a constructor
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("papaya");
        fruits.add("mango");
        fruits.add("watermelon");


        //using lambda expression
        Function<List<String>, Set<String>> functionListString = (fruitList) -> new HashSet<>(fruitList);
        System.out.println(functionListString.apply(fruits));



        // using method references

        Function<List<String>, Set<String>> functionListString1 = HashSet::new;
        System.out.println(functionListString1.apply(fruits));





    }
}
