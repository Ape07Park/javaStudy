package chepter2.static1;

public class Data3 {

    public String name;
    public static int count;

    public Data3(String name) {
        this.name = name;
        count++; // 같은 클래스 안이라 Data3. 생략
    }
}
