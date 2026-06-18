package chepter3.nested.test;

public class OuterClass4 {

     public void myMethod() {

         Hello hello = new Hello() {
             @Override
             public void hello() {
                 System.out.println("Hello.hello");
             }
         };



         hello.hello();
     }
}
