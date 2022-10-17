package equality;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SearchWithMutation {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(List.of("Fred", "Jim", "Sheila"));
    System.out.println(Collections.binarySearch(names, "Sheila"));
    System.out.println(Collections.binarySearch(names, "Jim"));
    names.set(1, "Tony");
    System.out.println(Collections.binarySearch(names, "Sheila"));
    System.out.println(Collections.binarySearch(names, "Jim"));

  }
}
