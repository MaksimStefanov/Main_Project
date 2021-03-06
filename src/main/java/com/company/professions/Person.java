package com.company.professions;

import java.util.Objects;

public class Person {
    private int age;
    String fullName;


    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, fullName);
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age +   ", fullName='" + fullName + '\'' + '}';
    }
}
