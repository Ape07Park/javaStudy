package chepter4.generic.test.ex3;


public class Shuttle<T extends BioUnit> {


   T unit;


    public void in(T value) {
       unit = value;
    }

    public T out() {
      return unit;
    }

   public void  showInfo() {
       System.out.println("이름: " + unit.getName() + ", " + "HP: " + unit.getHp());
   }
}
