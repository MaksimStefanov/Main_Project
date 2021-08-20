package collections;

public class SetDog3 extends SetPet {
    String name;

    @Override
    public String toString() {
        return  name ;
    }

    public SetDog3(String name) {
        this.name = name;
    }
}
