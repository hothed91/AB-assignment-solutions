package net.kathleensebree;

import java.io.File;
import java.text.ParseException;

/**
 * Created by Kathleen Sebree on 5/11/2017.
 */
public class Main {

  public static void main(String[] args) throws ParseException {
    LogFile logFile = new LogFile(new File("log-file.log"));
    logFile.printLogMessages();
  }

}
