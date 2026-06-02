package chepter3.nested.nested;

public class NestedOuter {

    // 파일 범위 내에서 접근 O
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {

        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 맴버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 맴버에 접근 X, 인스턴스의 주소값을 모르기에 인스턴스의 변수에 접근 불가
            // System.out.println(outInstanceValue);

            // 바깥 클래스이 클래스 맴버에는 접근 O, private도 접근 가능
            System.out.println(NestedOuter.outClassValue);
        }
    }
}
