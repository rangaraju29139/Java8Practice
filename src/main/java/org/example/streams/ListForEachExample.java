package org.example.streams;

import java.util.*;

public class ListForEachExample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("John", 20));
        list.add(new Person("John21", 21));
        list.add(new Person("John22", 22));
        list.add(new Person("John23", 23));
        list.add(new Person("John24", 24));

        System.out.println("************* using the list forEach*******************");
        // before java8

        for(Person person : list){
            System.out.println(person);
        }

        // java8 for each with lambda expression


        list.forEach((person)-> System.out.println(person));



        //using method references
        list.forEach(System.out::println);


        //using stream
        list.stream().forEach((person)-> System.out.println(person));



    // for each for set

        System.out.println("******************* using the set foreach *********");
        Set<Person> set = new HashSet<>();
        set.add(new Person("John", 20));
        set.add(new Person("John21", 21));
        set.add(new Person("John22", 22));
        set.add(new Person("John23", 23));
        set.add(new Person("John24", 24));


        // before java8


        for(Person person: set){
            System.out.println(person);
        }

        // using lambda expression

        set.forEach((person)-> System.out.println(person));

        //using method reference
        set.forEach((System.out::println));

        System.out.println("********** using the map ******************");
        // Map for each example

        Map<Integer,Person> map = new HashMap<>();
        map.put(1,new Person("John", 20));
        map.put(2,new Person("John21", 21));
        map.put(3,new Person("John22", 22));
        map.put(4,new Person("John23", 23));
        map.put(5,new Person("John24", 24));

          //before java8

        for(Map.Entry<Integer,Person> entry : map.entrySet()){
            System.out.println(entry.getKey() );
            System.out.println(entry.getValue().getName());
        }











    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
