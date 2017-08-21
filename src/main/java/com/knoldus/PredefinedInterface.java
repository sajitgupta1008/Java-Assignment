package com.knoldus;

import java.util.function.*;

class PredefinedInterface {

     Boolean predicateTest(int x){
        Predicate<Integer> predicate = (y)->y>0;
        return predicate.test(x);
    }

     void consumerTest(int x){
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(x);
    }

     Integer supplierTest(){
        Supplier<Integer> supplier = ()-> 5;
       return supplier.get();
    }

     Integer unaryOperratorTest(int x){
        UnaryOperator<Integer> unaryOperator = (y)->y*2;
        return unaryOperator.apply(x);
    }

     Integer binaryOperratorTest(int x,int v){
        BinaryOperator<Integer> binaryOperator = (z, y)->y*z;
        return binaryOperator.apply(x,v);
    }

    Boolean biFunction(int x, int y){
         BiFunction<Integer,Integer,Boolean> biFunctionOperator = (a,b)->a>b;
        return  biFunctionOperator.apply(x,y);
    }
}

/*class PredefinedInterfaceTest{
    public static void  main(String args[]){

        PredefinedInterface object = new PredefinedInterface();
        System.out.println(object.predicateTest(5));
        object.consumerTest(5);
        System.out.println(object.supplierTest());
        System.out.println(object.unaryOperratorTest(5));
        System.out.println(object.binaryOperratorTest(5,7));
        System.out.println(object.biFunction(5,7));
    }
}*/
