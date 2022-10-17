package equality;

class X {
  static String h = "Hello";
}

public class Ex2 {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = new StringBuilder("Hello").toString();
    String s3 = s2.intern();

    System.out.println(s1 == s2);
    System.out.println(s2 == s3);
    System.out.println(s1 == s3);
    System.out.println(X.h == s1);

    // All four here are "autoboxing"
    // autoboxing with primitive wrappers of small size pools things :)
    Integer x1 = 9;
    Integer x2 = 8;
    Integer x3 = x2 + 1;
    Integer x4 = 9;
    System.out.println("x1 == x2 " + (x1 == x2));
    System.out.println("x1 == x3 " + (x1 == x3));
    System.out.println("x1 == x4 " + (x1 == x4));

    // autoboxing constant pooling works with values in the
    // range of a byte -128 -> + 127
    Integer x5 = 128;
    Integer x6 = 128;
    System.out.println("x4 == x6 " + (x5 == x6));
  }
}
