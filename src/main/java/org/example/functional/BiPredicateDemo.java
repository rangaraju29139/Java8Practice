package org.example.functional;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> equalCheck = (a,b)-> (a==b );

        System.out.println(equalCheck.test(2,2));
        System.out.println(equalCheck.test(3,2));

       BiPredicate<Integer,Integer> biPredicate2 = (x,y) -> x>y;
        BiPredicate<Integer,Integer> biPredicate3 = (x,y) -> x==y;

        System.out.println(biPredicate2.and(biPredicate3).test(20,10));
        System.out.println(biPredicate2.or(biPredicate3).test(20,10));


    }
}
