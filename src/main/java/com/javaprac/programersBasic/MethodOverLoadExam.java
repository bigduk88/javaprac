package com.javaprac.programersBasic;

public class MethodOverLoadExam {
    public static void main(String[] args) {
        MyClass2 m = new MyClass2();

        System.out.println(m.plus(4, 5));
        System.out.println(m.plus(4,6,7));
        System.out.println(m.plus("Hello ", "world"));

    }
}
