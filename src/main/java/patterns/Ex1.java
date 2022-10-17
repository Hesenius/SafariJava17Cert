package patterns;

public class Ex1 {
  public static void main(String[] args) {
//    Object obj = "Hello";
    Object obj = new Object();

    var b = obj instanceof String str && str.length() > 3
        ? str : "Too short";


    System.out.println("---------------------");
    if (obj instanceof String str && str.length() > 3) {
      System.out.println(str);
    } else {
      System.out.println("too short");
    }
    System.out.println("---------------------");

    if (!(obj instanceof String str)) {
//      System.out.println(str);
    } else {
      System.out.println(str);
    }

    if (obj instanceof String str) {
      if (str.length() > 3) {
        System.out.println(str);
      } else {
        System.out.println("Too short");
      }
    }
//    if (obj instanceof String) {
//      String str = (String)obj;
//      if (str.length() > 3) {
//        System.out.println(str);
//      } else {
//        System.out.println("Too short");
//      }
//    }
  }
}
