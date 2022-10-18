package switchstuff;

import java.time.LocalDate;

public class ExpressionColon {
  public static void main(String[] args) {
    int x = 1;
// line n1
    var d =
    switch(x) {
      case 1:
        System.out.println("matching case 1");
        new String("Hello");
        yield LocalDate.of(2023, x, 1);
      default:
        yield LocalDate.of(2022, 12, 1);
    };
  }
}
