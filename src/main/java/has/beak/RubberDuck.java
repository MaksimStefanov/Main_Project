package has.beak;

import java.util.Objects;

public class RubberDuck extends HasBeak implements Swimable {
    private String madeOf = "Rubber";

    String type = "Bird";

    @Override
    public String toString() {
        return "RubberDuck{" +
                "hasBeak=" + hasBeak +
                ", madeOf='" + madeOf + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RubberDuck that = (RubberDuck) o;
        return Objects.equals(madeOf, that.madeOf) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), madeOf, type);
    }

    @Override
    public String food() {
        return "не ем";
    }

    @Override
    public void swim() {
        System.out.println("Без усилий держусь на плаву");

    }
}
