package enumsprivateconst;

enum X {
  A, B;
  // line n1
  public static String name(X x) { return x.name().toUpperCase(); }
/*  @Override // nope!!!
  public boolean equals(Object obj) {}
  public X[] values() {return null;} */
}

//  Which can be added at line n1?
//    A) @Override public String toString() { return name().toUpperCase(); }
//    B) public String toString() { return name().toUpperCase(); }
//    C) public String name() { return super.name().toUpperCase(); }
//    D) public static String name(X x) { return x.name().toUpperCase(); }

public class Ex3 {
}
