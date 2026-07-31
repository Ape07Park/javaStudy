package chepter4.generic.ex3;

import chepter4.generic.animal.Animal;
import chepter4.generic.animal.Cat;
import chepter4.generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitialV1 dogHospitial = new AnimalHospitialV1();
        AnimalHospitialV1 catHospitial = new AnimalHospitialV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이", 300);

        // 개 병원
        dogHospitial.setAnimal(dog);
        dogHospitial.checkup();

        // 개 병원
        catHospitial.setAnimal(cat);
        catHospitial.checkup();

        // 문제1: 개 병원에 고양이 전달
        dogHospitial.setAnimal(cat); // 매개변수 체크 실패: 컴파일 오류 발생 X

        // 문제2: 개 타입 반환
        dogHospitial.setAnimal(dog);
        Dog biggerDog = (Dog) dogHospitial.bigger(new Dog("멍멍이", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
