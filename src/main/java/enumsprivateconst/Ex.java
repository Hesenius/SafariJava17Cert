package enumsprivateconst;

enum Day {
  MONDAY(1), TUESDAY;
  /*private*/ Day(int d) {}
  Day() {}
}

public class Ex {
  public static void main(String[] args) {
    System.out.println(Day.MONDAY);
  }
}
