package chepter4.generic.ex3;

import chepter4.generic.animal.Animal;

public class AnimalHospitialV2<T> {

    private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup() {

        // T의 타입을 메서드를 정의하는 시점에 알 수 없다. Object의 기능만 사용 가능

        animal.toString();
        animal.equals(null);

        // System.out.println("동물 이름: " + animal.getName());
        // System.out.println("동물 크기: " + animal.getSize());
        // animal.sound();


    }

    public Animal bigger(T target){

        // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }

}
