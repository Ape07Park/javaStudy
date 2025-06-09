package chepter2.access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출" + publicField);
    }

     void defaultMethod() {
        System.out.println("publicMethod 호출" + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출" + privateField);
    }

    // AccessData의 메소드에 해당함. 그래서 AccessData의 필드에 접근하는 것이 허용됨
    // AccessData라는 파일 안에 있는 것이라 접근 제어자 상관없이 모든 필드에서 접근 가능
    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
