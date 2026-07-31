package chepter4.generic.ex3;

import chepter4.generic.animal.Animal;
import chepter4.generic.animal.Cat;

public class AnimalHospitialV1 {

    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {

        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();

    }

    public Animal bigger(Animal target){
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
