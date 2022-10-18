package switchstuff;

public class Alternation {
  public static void main(String[] args) {
    short s = 8;
    System.out.println(switch (s) { // line n1
      // line n2
// matches 14, because of bitwise OR operator
//      case 2|4|6|8 -> "Even < 10";
      case 2, 4, 6, 8 -> "Even < 10";
//      case 11 -> case 12 -> "Bad";
      default -> "It's something else";
    });
  }
}
