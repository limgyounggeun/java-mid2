package generic.ex3;

public class AnimalHospitalV2 <T> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkUp(){
        //T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object 기능만 사용 가능
        // System.out.println("동물 이름 : "+ animal.getName());
        // System.out.println("동물 크기 : " + animal.getSize());
        //animal.sound();
    }

    public T bigger(T target){
        //컴파일 오류
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
