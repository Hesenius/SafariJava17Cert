package switchstuff;

public class ExpressionArrow1 {
  public static void main(String[] args) {
    final String s = "Hello"; // null causes NPE at line 8 in LTS Java 17
// line n1
    var m =
        switch (s) {
          // line n2
          default -> "Unknown";
          case "Hello" -> "Bonjour";
        };
    System.out.println(m);
  }
}
