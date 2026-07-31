package chepter4.generic.ex3;

import chepter4.generic.animal.Animal;

public class AnimalHospitialV3<T extends Animal> {

    private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Animal bigger(T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
