package has.beak;

import java.util.Objects;

public class Lastochka extends HasBeak implements Flyable {

    String type = "Bird";

    @Override
    public String toString() {
        return "Lastochka{" +
                "hasBeak=" + hasBeak +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lastochka lastochka = (Lastochka) o;
        return Objects.equals(type, lastochka.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String food() {
        return "ем жуков";
    }

    @Override
    public void fly() {
        System.out.println("Умею летать");
    }
}
