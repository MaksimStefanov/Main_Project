package OOP;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    //------------------------1-------------------------------------
    String name;
    int age;
    boolean maritalStatus;

    //-----------------------------10-----------------------------
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

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    //------------------------------2-------------------------------------
    //Конструктор - по умолчанию (по умолчанию имя = Ivan, возраст = 30, женат/замужем = false )
    public Person() {
        name = "Ivan";
        age = 13;
        maritalStatus = false;
    }


    //- с 1 параметром
    public Person(String name) {
        this.name = name;
    }

    //с 2мя параметрами
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // с 3мя параметрами
    public Person(String name, int age, boolean maritalStatus) {
        this.name = name;
        this.age = age;
        this.maritalStatus = maritalStatus;

    }

//---------------------------------------------------------------------------------

    public int countOfCelebration() {
        int count = age / 10;
        return count;
    }

    public char firstLetterOfMyName() {
        return name.charAt(0);
    }

    //--------------------------------------3,4-----------------------------------------------
    @Override
    public String toString() {
        return String.format("My name is %s. I'm %d years old. Am I married? %s", name, age, maritalStatus);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && maritalStatus == person.maritalStatus && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, maritalStatus);
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Alex");
        Person person2 = new Person("Vova", 17);
        Person person3 = new Person("Yana", 21, true);
        person3.age = 45;
//*****************************************************************************

        System.out.println(person.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
//-----------------------------------7--------------------------------------------------

        System.out.println(person.age + " " + person1.age + " " + person2.age + " " + person3.age);
        System.out.println(person.name + " " + person1.name + " " + person2.name + " " + person3.name);
        System.out.println(person.maritalStatus + " " + person1.maritalStatus + " " + person2.maritalStatus + " " + person3.maritalStatus);
//***********************************8*******************************************************************************************
        int[] massiveOfAges = {person.age, person1.age, person2.age, person3.age};
        String[] massiveOfNames = {person.name, person1.name, person2.name, person3.name};
        boolean[] massiveOfmaritalStatus = {person.maritalStatus, person1.maritalStatus, person2.maritalStatus, person3.maritalStatus};

        System.out.println(Arrays.toString(massiveOfAges));
        System.out.println(Arrays.toString(massiveOfNames));
        System.out.println(Arrays.toString(massiveOfmaritalStatus));

        Person[] massive = {person, person1, person2, person3};
        for (Person a : massive) {
            System.out.println("Возраст: " + a.age + "  Имя: " + a.name);

        }
//------------------------------------9--------------------------------------
        System.out.println(person3.countOfCelebration());
        System.out.println(person3.firstLetterOfMyName());
    }
}

