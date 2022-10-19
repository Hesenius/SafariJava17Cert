package nestedinner;

import java.util.function.Predicate;

public class Ex1 {
  public static void main(String[] args) {
    int len = 3;
    Predicate<String> ps = new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.length() > len; // line n1
      }
    };
    // line n2
//    System.out.println("testing lines " + (++len));
  }
}
