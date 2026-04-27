package chepter3.wrapper;

public class AutoBoxingMain1 {

    public static void main(String[] args) {

        // Primitive type -> Wrapper type
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper type -> Primitive type
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);



    }
}
