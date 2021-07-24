package Birds;

public abstract class Bird {
    boolean hasBeak = true;
    String name;


    public void eat() {
        System.out.println("Я " + food());
    }

    public abstract String food();

}
