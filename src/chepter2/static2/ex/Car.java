package chepter2.static2.ex;

public class Car {

    private String carName;
    private static int totalCars = 0;


    public Car(String carName) {
        this.carName = carName;
        totalCars++;

        System.out.println("차량 구입 , 이름 : " + carName);
    }

    public static void showTotalCars() {

        System.out.println("구입한 차량 수 :" + totalCars);
    }
}
