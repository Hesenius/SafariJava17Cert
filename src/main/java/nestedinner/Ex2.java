package nestedinner;

class Outer1 {
  void doStuff() {
    System.out.println("z is " + z);
  }
  int z;

  class Inner1 {
    private int y = 100;
    // line n1
    void showX() {
      System.out.println("x is " + x);
    }
  }
  private int x = 99;
  // line n2

}
public class Ex2 {
//  void showX() {
//    System.out.println("x is " + x); }
//  void showY() {
//    System.out.println("y is " + y); }
//  void showAnotherY(Outer1.Inner1 another) { sop("y is " + another.y); }
//  static Outer1.Inner1 makeOne() { return new Outer1.Inner1(); }
  public static void main(String[] args) {

  }
}
