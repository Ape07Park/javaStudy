package chepter4.generic.ex5;

import chepter4.generic.animal.Animal;
import chepter4.generic.animal.Cat;
import chepter4.generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> box = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 O 따라서 Object도 가능
        writeBox(box);
        writeBox(animalBox);

        // 하한이 Animal 따라서 Animal 하위의 dog는 불가
        // writeBox(dogBox);

        Animal animal = animalBox.getValue();
        System.out.println("animal = " + animal);
    }

    static void writeBox(Box<? super Animal> box){
        box.setValue(new Dog("멍멍이", 100));
    }
}
