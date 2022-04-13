package Birds;

import has.beak.Swimable;

public class Utkonos extends Bird implements Swimable {
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
        return "Utkonos{" +
                "hasBeak=" + hasBeak +
                '}';
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
