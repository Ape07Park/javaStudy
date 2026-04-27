package chepter3.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);

        Integer integerObj = Integer.valueOf(10); // -128 -- 127 자주 사용하는 숫자 값 재사용, 불변

        Long longObj = Long.valueOf(100);

        Double doubleObj = Double.valueOf(100.1);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intVal = newInteger.intValue();
        System.out.println("intVal = " + intVal);
        long longVal = longObj.longValue();
        System.out.println("longVal = " + longVal);
        double doubleVal = doubleObj.doubleValue();
        System.out.println("doubleVal = " + doubleVal);

        System.out.println("비교");
        System.out.println("equals " + (newInteger.equals(integerObj)));



    }

}
