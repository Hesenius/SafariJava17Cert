package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiCatch {
  void doStuff() throws IOException {};
  void doStuff2()
      throws FileNotFoundException, SQLException{

  };

  void tryStuff() {
    try {
      doStuff();
//      doStuff2();

      // SIBLING exception types are prohibited
//    } catch (IOException | FileNotFoundException | SQLException e) {
      // type of e is actually the common parent Exception
      // handle this exception...
//    }

// works, but duplicates code!!
    } catch (IOException e) {
      // handle this exception...
//    } catch (SQLException e) {
//      // handle this exception...
    }
  }
}
