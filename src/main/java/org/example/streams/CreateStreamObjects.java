package org.example.streams;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {
        // creating a stream
        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);


        // creating a Stream from collections
        Collection<String> collection = Arrays.asList("java", "j2ee", "Spring","hibernate");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        List<String> list = Arrays.asList("java", "j2ee", "Spring","hibernate");
        Stream<String> listStream = list.stream();
        listStream.forEach(System.out::println);


        Set<String> set = new HashSet<>(list);
        Stream<String> setStream = set.stream();
        setStream.forEach(System.out::println);

        String[] strArray = {"a", "b", "c", "d", "e"};
        Stream<String> strArrayStream = Arrays.stream(strArray );
        strArrayStream.forEach(System.out::println);







    }
}
