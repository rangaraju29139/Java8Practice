package org.example.lambda;


interface Addable{
    int addition(int a,int b);
}
class AddableImpl implements Addable{
   public  int addition(int a,int b){
        return a + b;
    }
}
public class LambdaParameters {
    public static void main(String[] args) {
        Addable addition = new AddableImpl();
        System.out.println(addition.addition(1,2));

        Addable addition2 = (a,b) -> ( a+b);

        addition2.addition(2,3);

    }
}
