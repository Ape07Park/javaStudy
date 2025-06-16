package chepter2.static2;

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
    }


}
