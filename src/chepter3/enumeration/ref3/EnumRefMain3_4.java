package chepter3.enumeration.ref3;

public class EnumRefMain3_4 {


    public static void main(String[] args) {

        int price = 10000;

        Grade [] grades = Grade.values();

        for (Grade grade : grades) {
            printDiscount(grade, price);
        }

    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println("등급은 "  + grade.name() + " 할인 가격은 " + grade.discount(price));
    }
}
