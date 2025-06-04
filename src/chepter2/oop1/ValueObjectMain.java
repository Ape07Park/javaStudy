package chepter2.oop1;

public class ValueObjectMain {

    public static void main(String[] args) {

        ValueData valueData = new ValueData();

        // 객체와 메소드 분리되어 존재
        valueData.add();
        valueData.add();
        valueData.add();

        System.out.println(valueData.value);
    }
}
