package chepter2.access.a;

public class AccessInnerMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지라 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private은 외부에서 호출 불가 즉 자기 파일에서만 호출 가능
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();

    }
}
