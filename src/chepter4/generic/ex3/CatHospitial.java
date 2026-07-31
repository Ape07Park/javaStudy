package chepter4.generic.ex3;

import chepter4.generic.animal.Cat;

public class CatHospitial {

    private Cat animal;

    public Cat getAnimal() {
        return animal;
    }

    public void setAnimal(Cat animal) {
        this.animal = animal;
    }

    public void checkup() {

        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();

    }

    public Cat bigger(Cat target){
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
