package nestedinner;

class Outer {
  class Inner {

    void makeOne() {
      new Inner();
      new Outer.Inner();
    }
  }
}

public class Ex3 {
  int getValue() { return 101; }
  int x = 99;
  void doStuff() {
//    int x = 100;
    System.out.println(this.x);
    Ex3 thing = null;
    System.out.println(thing.x);
    System.out.println(thing.x);
    System.out.println(thing.getValue());
    System.out.println(new Ex3().getValue());
  }
  public static void main(String[] args) {
//    new Inner();
//    new Outer.Inner();
//    Outer ou = new Outer(); new ou.Inner();
    new Outer().new Inner();
//    new Outer() { new Inner(); }
  }
}
