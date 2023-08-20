package org.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    private static List<Product> getProducts(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "1",1));
        products.add(new Product(2, "2",2));
        products.add(new Product(3, "3",3));
        products.add(new Product(4, "4",4));
        return products;
    }
    public static void main(String[] args) {

        // without using streams to filter the products having the price > 2
        List<Product> products = new ArrayList<>();
        for(Product p :getProducts()) {
            if(p.getPrice() > 2){
                products.add(p);
            }
        }
        for(Product p :products){
            System.out.println(p);

        }

        System.out.println("***********************************");

        // using stream to filter the producst having the price > 2

        List<Product> filteredProducts = getProducts().stream().filter(product -> product.getPrice() > 2 ? true : false).collect(Collectors.toList());
        filteredProducts.forEach(product -> System.out.println(product));





    }
}

class Product{
    private int id;
    private String name;
    private  float price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}