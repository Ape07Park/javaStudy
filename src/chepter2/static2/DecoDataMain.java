package chepter2.static2;

// import static
//import static chepter2.static2.DecoData.*;
//import static chepter2.static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출2");
        DecoData decoData = new DecoData();
        decoData.instanceCall();

        System.out.println("3. 인스턴스 호출3");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();

        DecoData.staticCall(decoData);

        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }


}
