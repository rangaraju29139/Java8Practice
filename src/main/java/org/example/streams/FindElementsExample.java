package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementsExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2,3,2,1);

       Optional<Integer> result =  list.stream().findFirst();
       if(result.isPresent()) {
           System.out.println(result.get());
       }else{
           System.out.println("stream is empty");
       }

       Optional<Integer> resultFindAny = list.stream().findAny();
        if(resultFindAny.isPresent()) {
            System.out.println(resultFindAny.get());
        }else{
            System.out.println("stream is empty");
        }

    }
}
