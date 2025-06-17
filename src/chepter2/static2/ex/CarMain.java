package chepter2.static2.ex;

public class CarMain {
    
    // static 변수 선언
    private static Car staticCar;

    public static void main(String[] args) {
        // static 변수에 Car 객체의 주소값 담기. 이렇게 하면 static 영역에서도 힙에 있는 인스턴스 참조 가능
        staticCar = new Car("K5"); // static 변수라도 같은 생성자를 사용 따라서 카운트가 올라감

        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        Car.showTotalCars(); //구매한 차량 수를 출력하는 static 메서드
    }
}
