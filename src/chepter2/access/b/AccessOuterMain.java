package chepter2.access.b;

import chepter2.access.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 패키지가 달라 호출 불가
//        data.defaultField = 2;
//        data.defaultMethod();

        // private은 외부에서 호출 불가 즉 자기 파일에서만 호출 가능
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();

    }
}
