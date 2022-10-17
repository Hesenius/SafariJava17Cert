package switchstuff;

enum Day {MONDAY;};

public class Ex1 {
  public static void main(String[] args) {
    Day ex = Day.MONDAY;

    int x = 99;
    int y = 89;
//    while (x) {}

    switch (x) {
      case 99:
// NOPE y must be a constant expression,
// i.e. must be final int...
//      case y:
    }

    switch (ex) {
      case MONDAY:
    }

//    switch (x) {
//      case Day.MONDAY:
//    }
//    long count = 99;
//    switch (count) {
//    }
  }
}
