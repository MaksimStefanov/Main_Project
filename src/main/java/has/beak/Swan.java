package has.beak;

import java.util.Objects;

public class Swan extends HasBeak implements Swimable, Flyable {
    String type = "Bird";

    @Override
    public String toString() {
        return "Swan{" +
                "hasBeak=" + hasBeak +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Swan swan = (Swan) o;
        return Objects.equals(type, swan.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String food() {
        return "ем траву";
    }

    @Override
    public void fly() {
        System.out.println("Умею летать");
    }

    @Override
    public void swim() {
        System.out.println("Умею плавать");

    }
}
