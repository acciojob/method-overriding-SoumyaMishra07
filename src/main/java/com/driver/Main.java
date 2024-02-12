package com.driver;
class A {
    // Method meth in class A
    String meth() {
        return "Invoking method from class A";
    }
}
class B extends A {
    // Overriding method meth in class B
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}
public class Main {
    public static void main(String[] args) {
        B objB = new B();
        // Calling method meth from class A using the object of class B
        System.out.println(objB.meth());
        // here we calling the overridden method meth from class B
        // It will print Method is overridden in Extended class B
        System.out.println(objB.meth());
    }
}