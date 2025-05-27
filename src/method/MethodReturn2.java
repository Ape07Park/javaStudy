package method;

public class MethodReturn2 {

    public static void main(String[] args) {

        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {

       if (age < 18) {
           System.out.println(age + "살 " + "출입 불가");
//           return; 생략 가능, 생략 시 자바가 컴파일할 때 return 자동으로 붙임
       } else { 
           System.out.println("환영합니다");
       }
    }
}
