package chepter4.generic.ex4;

import chepter4.generic.animal.Animal;

public class ComplexBox <T extends Animal>{

    private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    // 상한이 안정해져있어서 기본적으로 Object 타입
    public <T> T printAndReturn(T t){
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }
}
