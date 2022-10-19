package liskovsubstitution;

abstract class ConstBase2 {
  private ConstBase2() { }
  public static class ConstSub2 extends ConstBase2 {

  }
}

class ConstBase {
  private ConstBase() {}
  ConstBase(int x) {}
}

class ConstSub extends ConstBase {
  ConstSub() {
    super(1);
  }
}
public class ConstAccess {
}
