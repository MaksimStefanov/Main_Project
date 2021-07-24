package Birds;

import java.util.Objects;

public class RubberDuck extends Bird implements Swimable {
    private String madeOf = "Rubber";

    @Override
    public String toString() {
        return "RubberDuck{" +
                "hasBeak=" + hasBeak +
                ", madeOf='" + madeOf + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RubberDuck that = (RubberDuck) o;
        return Objects.equals(madeOf, that.madeOf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(madeOf);
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
