package nestedinner;

import java.util.function.Predicate;

class Date {
  int day, month, year;
  // "explicit receiver parameter" i.e. "this"
  // NOT allowed for constructors.
  public Date(/*Date this, */int day, int month, int year) {
    this.day = day;
  }

//  public static String asText(int day, int month, int year) {
//  public static String asText(Date target) {
//  public /*static*/ String asText(/*@NotNull */Date this) {
  @Override public /*static*/ String toString(/*@NotNull */Date this) {
//  public /*static*/ String asText() {
    return "Date: day=" + this.day + "...";
  }

//  Predicate<String> ps = (@Deprecated String s) -> s.length() > 3;

  public static boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }
}


public class ExplicitThis {


}
