package chepter3.nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;


  static class Nested {
      private int nestedInstanceValue = 1;

      public void print() {

          // 자신의 필드에 접근 O
          System.out.println(nestedInstanceValue);


            // 바깥 클래스의 인스턴스 변수에 접근 x
          // System.out.println(outInstanceValue);

          // 바깥 클래스의 정적 변수에 접근 o
          System.out.println(NestedOuter.outClassValue);

      }
  }
}
