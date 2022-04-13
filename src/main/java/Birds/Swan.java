package Birds;

import has.beak.Flyable;
import has.beak.Swimable;

public class Swan extends Bird implements Swimable, Flyable {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Swan{" +
                "hasBeak=" + hasBeak +
                '}';
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
