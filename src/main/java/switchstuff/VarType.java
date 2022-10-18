package switchstuff;

public class VarType {
  public static void main(String[] args) {
    var x = 10;
    var res
        = switch(x) {
      case 10 -> x;
//      case 10 -> {
//        System.out.println("It's ten");
//        yield x;
//      }
//      case 10 -> {
//        System.out.println("it's ten");
//        return x; // line n1
//      }
      default -> "It's not ten";
    };
    res.compareTo(null);
  }
}
