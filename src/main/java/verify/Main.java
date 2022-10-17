package verify;

sealed class X permits Main {}

public final class Main extends X {
  public static void main(String[] args) {
    System.out.println("Hello Java 17 world!");
  }
}