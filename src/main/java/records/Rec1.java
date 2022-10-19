package records;

// record is intended to be "simple data carrier"
// immutable-ish class, more than a tuple with named fields
// can include methods
// also includes a bunch of pre-built stuff, so you don't have
// to write it yourself, or use Lombok
// must have fields (but including zero)
// fields are private final -- intent is "immutability"
// has equals, hashCode, toString
// getters simply use the names of the fields
public record Rec1(String x, int y/*, StringBuilder sb*/)
/*extends java.lang.Record */{ // NO extends permitted
  // default aka "canonical" constructor must
  // take arguments for the fields
  // initialize them
  // all paths through initialization MUST end with
  // the canonical constructor
  private Rec1(String s) {
    this(s, 99);
  }
  // can, but often do not define canonical constructor explicitly
//  public Rec1(String x, int y) {
//    System.out.println("in Rec1 canonical constructor");
//    this.x = x;
//    this.y = y;
//  }

  public Rec1 {
    if (x == null || x.length() == 0) {
      throw new IllegalArgumentException("Bad x");
    }
    x = x.toUpperCase();
//    this.x = x; // NONONO this is the job of the canonical constructor
  }
  static class ClientSupport {}
}

class Ex1 {
  int record = 99;

  public static void main(String[] args) {
    Rec1 r1 = new Rec1("Hello", 99);
    Rec1 r2 = new Rec1("Hello", 99);
    Rec1 r3 = new Rec1("Salut", 100);
    System.out.println(r3);
    System.out.println(r1.equals(r2));
    System.out.println("r1.x is " + r1.x());
  }
}
