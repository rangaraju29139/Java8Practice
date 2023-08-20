package org.example.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String email = "email@example.com";
        //static methods used to created the empty optional objects:  of , empty, ofNullable
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        //  null checking is being done here in the of method
        // if value is null return null pointer exception

        Optional<String> emailOptional   = Optional.of(email);
        System.out.println(emailOptional);

        // same like above of method but ofNullable wont throw and null pointer exception if the value is null
        Optional<String> stringOptional = Optional.ofNullable(email);
        System.out.println(stringOptional);

        // get method is used to retrieve the value of the object
        // throws no such element found exception if the value is null
        System.out.println(stringOptional.get());

        // check if the value is present in the Optional object
        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }else{
            System.out.println("no value present");
        }

        String DefaultValue = stringOptional.orElse("default@gmail.com");
        String optionalvalue = stringOptional.orElseGet(()-> "default@gmail.com");

        String optionalObject = stringOptional.orElseThrow(()-> new IllegalArgumentException("email not exists"));

        // if present

        Optional<String> gender = Optional.of("male");
        Optional<String> emptyOptional = Optional.empty();

        gender.ifPresent((s)-> System.out.println("value is present"));
        emptyOptional.ifPresent((s)-> System.out.println("value is not present "));

        // filter
        String result = "abc";
        if(result!=null && result.contains("abc")){
            System.out.println(result);
        }

        Optional<String> optionalString = Optional.of(result);
        optionalString.filter(res -> res.contains("abc")).map(String::trim).ifPresent(res -> System.out.println(res));

        // map


    }
}
