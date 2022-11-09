package com.ebruski.java8.methodref;

public class MyClass {

    public void myMethod123(int x){
        System.out.println(x);
    }

    public static void main(String[] args) {
        MyInterface f = i -> System.out.println(i);
        f.myMethod(10);

        MyClass c = new MyClass();
        MyInterface f1 = c :: myMethod123;
        f1.myMethod(20);
    }
}