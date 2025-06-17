package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        ComplexBox<Dog> box = new ComplexBox<>();
        box.set(dog);
        Cat cat1 = box.printAndReturn(cat);
        System.out.println(cat1);
    }
}
