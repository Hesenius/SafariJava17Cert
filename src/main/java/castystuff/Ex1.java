package castystuff;

class Base {
  void doBaseStuff(Base b) { System.out.println("doBaseStuff"); }
//  void doBaseStuff(Sub b) { System.out.println("doBaseStuff"); }
}

class Sub extends Base {
//  @Override
//  void doBaseStuff(Sub s) { System.out.println("doSubStuff"); }
  void doBaseStuff(Base s) { System.out.println("doSubStuff"); }
  void doOtherStuff() { System.out.println("doOtherStuff"); }
}

public class Ex1 {
  public static void main(String[] args) {

    Base b = new Sub();
    b.doBaseStuff(b);
    Sub s = new Sub();
    b.doBaseStuff(s);

    s.doBaseStuff(b);
    s.doBaseStuff(s);

//    ((Sub) b).doOtherStuff();
  }
}
