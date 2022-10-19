package liskovsubstitution.subpkg;

import liskovsubstitution.Base;

public class AnotherSub extends Base {
  public void showX() {
    System.out.println(this.x);
  }
  public void showX(AnotherSub as) {
    System.out.println(as.x);
  }
  public void showX(Base b) {
//    System.out.println(b.x);
    System.out.println(((AnotherSub)b).x);
  }
}
