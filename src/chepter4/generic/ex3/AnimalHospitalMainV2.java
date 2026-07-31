package chepter4.generic.ex3;

import chepter4.generic.animal.Cat;
import chepter4.generic.animal.Dog;

public class AnimalHospitalMainV2 {

    public static void main(String[] args) {

        AnimalHospitialV2<Dog> dogHospitial = new AnimalHospitialV2<>();
        AnimalHospitialV2<Cat> catHospitial = new AnimalHospitialV2<>();
        AnimalHospitialV2<Integer> integerHospitial = new AnimalHospitialV2<>();
        AnimalHospitialV2<Object> objectHospitial = new AnimalHospitialV2<>();
    }
}
