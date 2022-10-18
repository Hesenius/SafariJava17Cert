package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class MyException extends Exception {}
public class WhatToCatch {
  static void mightBreak()
      throws IOException, FileNotFoundException, SQLException {}
  void caller() throws Throwable {
    try {
      mightBreak();
    }
    catch (IOException e) {}
    catch (SQLException e) {}
    // line n1
  }
}
