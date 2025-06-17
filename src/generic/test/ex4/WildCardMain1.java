package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));
        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildcardV1(dogBox);


        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildcardV2(dogBox);

        WildCardEx.printAndReturnGeneric(dogBox);
        WildCardEx.printAndReturnWildCard(dogBox);
    }
}
