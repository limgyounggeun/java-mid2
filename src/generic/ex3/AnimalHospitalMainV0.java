package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("고양이1",  300);

        //개 병원
        dogHospital.setAnimal(dog);
        dogHospital.checkUp();
        //고양이 병원
        catHospital.setAnimal(cat);
        catHospital.checkUp();
        //문제 1: 개 병원에 고양이 전달
        //dogHospital.setAnimal(cat); => 다른 타입 입력시 컴파일 오류 발생

        //문제 2: 개 타입 반환
        dogHospital.setAnimal(dog);
        Dog BiggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("BiggerDog = " +BiggerDog);
    }
}
