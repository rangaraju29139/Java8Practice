package org.example.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class CountMinMaxExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
        System.out.println(stream.count());
        Integer integer = Stream.of(1,2,3,4,5,6,7,8).min(Comparator.comparingInt(Integer::valueOf)).get();
        System.out.println("Min : "+integer);

       Integer maxInteger =  Stream.of(1,2,3,4,5,6,7,8).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("max : "+maxInteger);

    }
}
