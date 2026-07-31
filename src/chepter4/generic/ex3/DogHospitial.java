package chepter4.generic.ex3;

import chepter4.generic.animal.Dog;

public class DogHospitial {

    private Dog animal;

    public Dog getAnimal() {
        return animal;
    }

    public void setAnimal(Dog animal) {
        this.animal = animal;
    }

    public void checkup() {

        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();

    }

    public Dog bigger(Dog target){
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
