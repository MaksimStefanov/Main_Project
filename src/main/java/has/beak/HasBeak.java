package has.beak;

import java.util.Objects;

public abstract class HasBeak {
    boolean hasBeak = true;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HasBeak hasBeak1 = (HasBeak) o;
        return hasBeak == hasBeak1.hasBeak;
    }

    @Override
    public String toString() {
        return "HasBeak{" +
                "hasBeak=" + hasBeak +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasBeak);
    }

    public void eat() {
        System.out.println("Я " + food());
    }

    public abstract String food();

}
