package chepter4.generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {

        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);

        // Object object = objectBox.get();

        Integer integer = (Integer) integerBox.get(); // Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        // Integer integer2 = (Integer) objectBox.get();

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("Hello");
        String string = (String) stringBox.get();// Object -> String 캐스팅
        System.out.println("string = " + string);

        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
        // intert

    }
}
