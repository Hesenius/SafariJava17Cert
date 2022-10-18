package enumsprivateconst;

// NOT PERMITTED
// - mark as final (but it "kinda" is)
// - use for an extends
// - have extends clause (parent is j.l.Enum, but cannot say so)
enum Suit /*extends java.lang.Enum<Suit> */{
  HEARTS {
    boolean isTrumps() {
      System.out.println("In overriding isTrumps for HEARTS");
      return true;
    }
  }, DIAMONDS, CLUBS, SPADES;
  /*final*/ boolean isTrumps() {
    System.out.println("in isTrumps this is " + this);
    return this == HEARTS;
  }
  static boolean isTrumps(Suit s) {
    System.out.println("in isTrumps (static) s is " + s);
    return s == HEARTS;
  }
}

//enum S2 extends Suit {}
public class Ex2 {
  public static void main(String[] args) {
    System.out.println("asking about hearts");
    Suit.HEARTS.isTrumps();
    System.out.println("asking about diamonds");
    Suit.DIAMONDS.isTrumps();
//    Suit.isTrumps();
  }
}
