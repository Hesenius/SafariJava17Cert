package sealedtypes;


sealed interface X permits Y, P, Q, Z, T, U {}
non-sealed class Y implements X {}
final class P implements X {}
sealed class Q implements X permits R {}
final class R extends Q {}
record T() implements X {}
enum U implements X {}

public class Ex1 {
}
