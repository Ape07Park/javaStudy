package chepter4.generic.ex3;

import chepter4.generic.animal.Cat;
import chepter4.generic.animal.Dog;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        DogHospitial dogHospitial = new DogHospitial();
        CatHospitial catHospitial = new CatHospitial();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이", 300);

        // 개 병원
        dogHospitial.setAnimal(dog);
        dogHospitial.checkup();

        // 개 병원
        catHospitial.setAnimal(cat);
        catHospitial.checkup();

        // 문제1: 개 병원에 고양이 전달
        // dogHospitial.setAnimal(cat); 다른 타입 입력: 컴파일 오류

        dogHospitial.setAnimal(dog);
        Dog biggerDog = dogHospitial.bigger(new Dog("멍멍이", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
