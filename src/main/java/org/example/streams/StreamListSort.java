package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class StreamListSort {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "papaya","mango");
        List<String> sortedFruits = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedFruits);

        //using the lambda function

        List<String> sortedFruits1 = fruits.stream().sorted((o1,o2)-> o1.compareToIgnoreCase(o2)).collect(Collectors.toList());
        System.out.println(sortedFruits);

        List<String> sortedFruits2 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedFruits);

        // descending order


        List<String> sortedFruits3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedFruits);

        //using the lambda function but by reversing the references

        List<String> sortedFruits4 = fruits.stream().sorted((o1,o2)-> o2.compareToIgnoreCase(o1)).collect(Collectors.toList());
        System.out.println(sortedFruits);


        // employees

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"1",1));
        employees.add(new Employee(2,"2",2));
        employees.add(new Employee(3,"3",3));
        employees.add(new Employee(4,"4",4));
        employees.add(new Employee(5,"5",5));

        // using the anonymous function in comparator

//        employees.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//              return   o1.getSalary() - o2.getSalary();
//            }
//        });
//
//        System.out.println(employees);



//        List<Employee> employees1 = employees.stream().sorted((o1,o2)-> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
//        System.out.println(employees1);


        // comparing the List
        List<Employee> employees1 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
       System.out.println(employees1);

       List<Employee> sortedById = employees.stream().sorted(Comparator.comparingLong(Employee::getId)).collect(Collectors.toList());
        System.out.println(sortedById);

        List<Employee> sortedByIdReverse = employees.stream().sorted(Comparator.comparingLong(Employee::getId).reversed()).collect(Collectors.toList());
        System.out.println(sortedByIdReverse);

    }
}
