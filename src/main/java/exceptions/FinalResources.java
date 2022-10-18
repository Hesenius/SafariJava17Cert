package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class FinalResources {
  public static void main(String[] args) throws Throwable {
    final var fr = new FileReader("main.txt");
    try (fr; // line n1
         final var br = new BufferedReader(fr);){ // line n2
      if (!br.ready()) {
//        br = new BufferedReader(new FileReader("backup.txt")); // line n3
      }
      String line;
      while ((line = br.readLine()) != null)
        System.out.println(">> " + line);
    }
//    fr.close();
  }
}
