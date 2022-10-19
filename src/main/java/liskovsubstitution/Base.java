package liskovsubstitution;

public class Base {
  protected int x = 99;
  void doBaseStuff() {
    System.out.println("doBaseStuff");
    System.out.println(x);
  }
}

class Sub extends Base {
//  @Override
  protected void doBaseStuff() {
    System.out.println("doSubStuff");
    System.out.println(x);
  }
  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }
}

class Ex1 {
}
