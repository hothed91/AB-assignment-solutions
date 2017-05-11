package net.kathleensebree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * LogFile is an object representation of the Log File being read.
 */
public class LogFile {

  private List<LogMessage> logMessages;
  private File logFile;

  /**
   * Constructor
   *
   * @param {@link File} logFile
   */
  public LogFile(File logFile) {
    setLogFile(logFile);
    setLogMessages();
  }

  public File getLogFile() {
    return logFile;
  }

  /**
   * LogFile setter
   * @param logFile
   */
  private void setLogFile(File logFile) {
    this.logFile = logFile;
  }

  public List<LogMessage> getLogMessages() {
    return logMessages;
  }

  /**
   * LogMessages setter
   */
  private void setLogMessages() {
    logMessages = new ArrayList<>();
    try {
      readLogFile(this.logFile);
    } catch (FileNotFoundException fnfe) {
      fnfe.printStackTrace();
    }
  }

  /**
   * Parses the log file adding log messages to the logMessages List
   * @param logFile
   * @throws FileNotFoundException
   */
  private void readLogFile(File logFile) throws FileNotFoundException {
    Scanner scanner = new Scanner(logFile);
    while(scanner.hasNextLine()) {
      String[] splitLine = scanner.nextLine().split(" ");
      logMessages.add(new LogMessage(splitLine[0] + " " + splitLine[1], splitLine[2], splitLine[3], splitLine[4], splitLine[5]));
    }
  }

  /**
   * Prints the Log Messages
   */
  public void printLogMessages() {
    logMessages.forEach(LogMessage::printLogMessage);
  }


}
