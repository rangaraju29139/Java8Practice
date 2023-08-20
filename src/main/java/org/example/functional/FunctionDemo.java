package org.example.functional;


import org.w3c.dom.ls.LSOutput;

import java.util.function.Function;

class FunctionImpl implements Function<String,Integer>{
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionDemo {
    public static void main(String[] args) {


        Function<String,Integer> f = new FunctionImpl();
        System.out.println(f.apply("hello"));
    }



}
