package chepter2.static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue; // 같은 클래스 소속

    public static void staticCall() { // 같은 클래스 소속
        staticValue ++; // 정적 변수 접근
        staticMethod(); // 정적 메소드 접근

        // 클래스 정보에는 주소값이 없음. 그래서 사용불가. 사용할려면 인스턴스를 생성해야함
//        instanceValue++;
//        instanceMethod();
    }

    public void instanceCall() {

        instanceValue ++; // 인스턴스 변수 접근
        instanceMethod();

        // 자기 클래스에 가서 접근하는 것. 인스턴스는 클래스를 따라 만든 실제 객체임. 그래서 클래스가 static 변수와 메소드에 대한 정보를 지니고 있으니
        // 당연히 클래스를 따라 만든 객체도 클래스의 static 변수와 메소드에 대한 정보가짐. 그래서 본인 클래스의 static에 접근 가능한 것.
        //  DecoData. 생략 가능
        DecoData.staticValue ++; // 정적 변수 접근
        DecoData.staticMethod(); // 정적 메소드 접근
    }

    // 인스턴스를 넘김
    public static void staticCall (DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() { // 같은 클래스 소속
        System.out.println("staticValue = " + staticValue);
    }
}
