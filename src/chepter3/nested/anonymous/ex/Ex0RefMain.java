package chepter3.nested.anonymous.ex;

public class Ex0RefMain {


    public static void hello(String str) {
        System.out.println("프로그램 시작"); // 변하지 않는 부분

        // 변하는 부분 시작
        System.out.println(str);// 변하는 부분
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }

    // TODO 중복 제거 리팩터링 시 변하는 부분과 변하지 않는 부분 구분하는 것이 중요
    public static void main(String[] args) {
        hello( "hello Java");
        hello( "hello Spring");

    //     Print print = new Print() {
    //
    //
    //         @Override
    //         public void print(String str) {
    //             System.out.println("프로그램 시작");
    //             System.out.println("hello " + str);
    //             System.out.println("프로그램 종료");
    //         }
    //     };
    //
    //     print.print("Java");
    //     print.print("Spring");



    }
}
