package org.example.functional;



import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> printAddition = (a,b) -> System.out.println(a+b);
        printAddition.accept(1,2);

        System.out.println("********** using the map ******************");
        // Map for each example

        Map<Integer, Person> map = new HashMap<>();
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

       map.forEach((k,v)-> {
           System.out.println(k + "=" + v);
       });

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
