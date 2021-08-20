package streams;

public class User {
    private String name;

    @Override
    public String toString() {
        return name +" - " +age ;
    }

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

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
