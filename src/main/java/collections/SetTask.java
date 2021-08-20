package collections;

import java.util.HashSet;
import java.util.Set;

public class SetTask {
    public static void main(String[] args) {
        SetPet cat1 = new SetCat3("вася");
        SetPet cat2 = new SetCat3("мурка");
        SetPet cat3 = new SetCat3("леля");
        SetPet dog1 = new SetDog3("тузик");
        SetPet dog2 = new SetDog3("боря");
        SetPet dog3 = new SetDog3("волкодав");
        Set<SetPet> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(dog1);
        set.add(dog2);
        set.add(dog3);
        for (SetPet item:set ) {
            System.out.println(item);

        }
    }
}
