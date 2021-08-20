package has.beak;

import java.util.Objects;

public class Utkonos extends HasBeak implements Swimable {
    String type = "Mammal";

    @Override
    public String toString() {
        return "Utkonos{" +
                "hasBeak=" + hasBeak +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Utkonos utkonos = (Utkonos) o;
        return Objects.equals(type, utkonos.type);
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
    public void swim() {
        System.out.println("Умею плавать");
    }
}
