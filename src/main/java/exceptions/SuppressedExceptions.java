package exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Arrays;

class AC4 implements AutoCloseable {
  private static int nextId = 1;
  private int myId = nextId++;
  {
    System.out.println("initializing resource " + myId);
  }
  @Override
  public void close() throws Exception {
    System.out.println("attempting to close resource " + myId);
    throw new SQLException();
  }
}

public class SuppressedExceptions {
  public static void main(String[] args) {
    try {
      runTheTest();
    } catch (Throwable t) {
      System.out.println("it broke: " + t);
      System.out.println(Arrays.toString(t.getSuppressed()));
    }
  }

  public static void runTheTest() throws Throwable {
    /*final */var one = new AC4(); // myId 1
    try (var two = new AC4(); // myId 2
         var three = new AC4(); // myId 3
         one;) {
      throw new FileNotFoundException();
    }
//    one = null;

    // C# structure, only one resource per "using" block
    // at least at sometime when I last looked at it!
    // also, Java decomposes the try/resources into
    // multiple nested structures like this
//    using (xxx) {
//      using (xxxx) {
//
//      }
//    }
  }
}