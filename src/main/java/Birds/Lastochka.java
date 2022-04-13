package Birds;

import has.beak.Flyable;

public class Lastochka extends Bird implements Flyable {


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
        return "Lastochka{" +
                "hasBeak=" + hasBeak +
                '}';
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
