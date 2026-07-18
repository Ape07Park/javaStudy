package chepter4.generic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {

        GenericBox integerBox = new GenericBox(); // 이렇게 적으면 자동으로 T 는 Object가 됨.

        integerBox.setValue(10);
        Integer result = (Integer) integerBox.getValue();
        System.out.println("result = " + result);
    }
}
