package chepter4.generic;

import chepter4.generic.animal.Animal;
import chepter4.generic.animal.Cat;
import chepter4.generic.animal.Dog;
import chepter4.generic.ex2.Box;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);


        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);
        animalBox.setValue(dog);
        animalBox.setValue(cat);

        Animal findAnimal = animalBox.getValue();
        System.out.println("findAnimal = " + findAnimal);
    }
}
