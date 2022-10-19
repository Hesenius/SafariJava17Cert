package nestedinner;

class OuterX {
  String x = "x in the outer object";
//  static class InnerX {
//    OuterX myEnclosingObject;
//    InnerX(OuterX myEnclosingObject) {
//      if (myEnclosingObject == null) {
//        throw new IllegalArgumentException();
//      }
//      this.myEnclosingObject = myEnclosingObject;
//    }
//  }
  class InnerX {
    String x = "x in the INNER object";
    //OuterX OuterX.this; IMPLICIT
    InnerX(OuterX OuterX.this) {
//      this.myEnclosingObject = myEnclosingObject;
    }
    void showX() {
      System.out.println("x is: " + x);
      System.out.println("outer x is "
      + OuterX.this.x);
    }
  }

  /* static */void funkyStuff() {
    new Runnable() {
      @Override
      public void run() {
        System.out.println(OuterX.this.x);
      }
    };
  }
}

public class HomeMadeInner {
  public static void main(String[] args) {
//    verb(object) form
//    OuterX.InnerX thing = new OuterX.InnerX(new OuterX());
    // equivalent subject verb form :)
    OuterX.InnerX thing = new OuterX().new InnerX();
    // static invocation is verb(object)
//    Date.asText(theDateInstance);
    // instance invocation is subject verb
//    theDateInstance.asText();

    thing.showX();
  }
}
