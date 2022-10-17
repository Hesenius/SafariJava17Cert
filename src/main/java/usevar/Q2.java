package usevar;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;

public class Q2 {
  public static void main(String[] args) throws Throwable {

//    var n = null;

    for (var x = 0; x < 3; x++)
      System.out.println(x);

    try (var in = new FileReader("");
         var out = new FileWriter("")) {
    }

//    int const = 99;
    var var = "var";

    var x = new int[]{1, 2, 3};
//    var []x1 = new int[]{1, 2, 3};

    String s1 = "Hello";
    Integer i1 = 99;

    var obj
        = true ? "Hello" : 99;
    obj.compareTo(null);
  }
}

//class var {}