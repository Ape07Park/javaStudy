public class Test {

    public static void main(String[] args) {

        // 자식에게만 있는 필드엔 접근 불가
        // 업케스팅
        B up = new D();

        // 오버라이딩 된 자식 메서드 사용
        System.out.println(up.getX());
        // 부모 필드 사용
        System.out.println(up.x);

        // 자식 고유 메서드 사용 불가
        // System.out.println(a.test());

        // 다운 캐스팅: 부모 타입으로 업케스팅한 것을 다시 자식 타입으로 돌리기 위해 사용
        D down = (D) up;

        down.go();

    }
}
