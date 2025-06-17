package generic.test.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        //Animal 포함 상위 타입 전달가능
        writeBox(objectBox);
        writeBox(animalBox);
        // 에러발생 ->writeBox(dogBox);
        // writeBox(catBox);
    }
    // super는 하한 Animal 보다 상위 클래스여야한다
    static void writeBox(Box<? super Animal> box){
        box.set(new Dog("멍멍이", 100));
    }
}
