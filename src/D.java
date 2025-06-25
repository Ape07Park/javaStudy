public class D extends B {
    int x = 7;

    public int getX() {
        return x * 3;
    }

    // 자식 고유 기능
    public void go() {
        System.out.println("자식 이동");
    }
}
