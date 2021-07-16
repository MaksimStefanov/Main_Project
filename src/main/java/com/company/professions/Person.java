package com.company.professions;

public class Person {
    private int age;
    String fullName;

    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age +   ", fullName='" + fullName + '\'' + '}';
    }
}
