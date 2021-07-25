package has.beak;

public class Main {
    public static void main(String[] args) {
        Swan swan = new Swan();
        System.out.println(swan.hasBeak);
        RubberDuck rubberDuck = new RubberDuck();
        System.out.println(rubberDuck.type);
        Utkonos utkonos = new Utkonos();
        System.out.println(utkonos.type);
    }
}

