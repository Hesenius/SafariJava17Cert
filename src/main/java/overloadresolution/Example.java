package overloadresolution;

public class Example {
//  Cake bakeCake(Flour f, Eggs e, Milk s) {}
//  Cake bakeCake(PacketMixture pm) {}
//  void doStuff(int x, int y = 10) {}
//  void doStuff(int x) { doStuff(x, 10);}

//  void doStuff(int x, int y) {}         // Method A
//  void doStuff(int x, long y) {}        // Method B
//  void doStuff(long x, int y) {}        // Method C
//  void doStuff(int ... x) {}            // Method D
//  void doStuff(int y, int ... x) {}            // Method D
//  void doStuff(Integer x, Number y) {} // Method E
//  void doStuff(Number x, Integer y) {} // Method E

  void doStuff(int ... x) {}
  void doStuff(Integer ... x) {}
  void doStuff(Integer x, Integer y) {}

  void tryStuff() {
//    var x = 2_000_000_000L;
    final int y = 10;
    short x = y;
    doStuff(1, 2);
  }
}
