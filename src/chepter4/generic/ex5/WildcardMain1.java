package chepter4.generic.ex5;

import chepter4.generic.animal.Animal;
import chepter4.generic.animal.Cat;
import chepter4.generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> box = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.setValue(new Dog("멍멍이", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildCardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildCardV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);



    }
}
