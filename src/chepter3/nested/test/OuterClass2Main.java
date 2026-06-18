package chepter3.nested.test;

public class OuterClass2Main {

    public static void main(String[] args) {

       OuterClass2 nestedClass = new OuterClass2();
       OuterClass2.InnerClass innerClass = nestedClass.new InnerClass();

        innerClass.hello();
    }
}
