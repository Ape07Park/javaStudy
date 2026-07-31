package chepter4.generic.ex3;

import chepter4.generic.animal.Cat;
import chepter4.generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitialV3<Dog> dogHospitial = new AnimalHospitialV3<>();
        AnimalHospitialV3<Cat> catHospitial = new AnimalHospitialV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이", 300);

        // 개 병원
        dogHospitial.setAnimal(dog);
        dogHospitial.checkup();

        // 개 병원
        catHospitial.setAnimal(cat);
        catHospitial.checkup();

        // 문제1: 개 병원에 고양이 전달
        // dogHospitial.setAnimal(cat); // 다른 타입 입력: 컴파일 오류

        // 문제2: 개 타입 반환
        dogHospitial.setAnimal(dog);
        Dog biggerDog = (Dog) dogHospitial.bigger(new Dog("멍멍이", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
