package chepter3.wrapper;

public class AutoBoxingMain2 {

    public static void main(String[] args) {

        // Primitive type -> Wrapper type
        int value = 7;
        Integer boxedValue = value; // auto-boxing,
        // Integer boxedValue = Integer.valueOf(value); 컴파일 단계에서 추

        // Wrapper type -> Primitive type
        int unboxedValue = boxedValue; // auto-unboxing
        // Integer boxedValue = Integer.valueOf(value);  컴파일 단계에서 추가

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);



    }
}
