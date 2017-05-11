package net.kathleensebree;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * LogMessage is a object representation of a log message from a log file
 */
public class LogMessage {

  public static final String dateFormat = "yyyy-MM-dd hh:mm:ss Z";

  public static final String UTC_Str = " UTC";

  private long time;
  private String ip;
  private String fName;
  private String lName;
  private long id;

  /**
   * Constructor
   *
   * @param time
   * @param ip
   * @param fName
   * @param lName
   * @param id
   */
  public LogMessage(String time, String ip, String fName, String lName, String id) {
    setTime(time);
    setIp(ip);
    setfName(fName);
    setlName(lName);
    setId(id);
  }

  public long getTime() {
    return time;
  }

  /**
   * Time setter
   *
   * @param time
   */
  private void setTime(String time) {
    try {
      this.time = convertToEpochSecUsing(time + UTC_Str);
    } catch(ParseException pe) {
      pe.printStackTrace();
    }
  }

  public String getIp() {
    return ip;
  }

  /**
   * IP setter
   *
   * @param ip
   */
  private void setIp(String ip) {
    this.ip = ip;
  }

  public String getfName() {
    return fName;
  }

  /**
   * fName setter
   *
   * @param fName
   */
  private void setfName(String fName) {
    this.fName = fName.split("=")[1];
  }

  public String getlName() {
    return lName;
  }

  /**
   * lName setter
   *
   * @param lName
   */
  private void setlName(String lName) {
    this.lName = lName.split("=")[1];
  }

  public long getId() {
    return id;
  }

  /**
   * ID setter
   *
   * @param id
   */
  private void setId(String id) {
    this.id = Long.parseLong(id.split("=")[1]);
  }

  /**
   * Converts a String timestamp to epoch seconds representation.
   *
   * @param timeStamp
   * @return epoch seconds
   * @throws ParseException
   */
  private long convertToEpochSecUsing(String timeStamp) throws ParseException {
    return new SimpleDateFormat(dateFormat).parse(timeStamp).toInstant().getEpochSecond();
  }

  @Override
  public String toString() {
    return "LogMessage{" +
            "time='" + time + '\'' +
            ", ip='" + ip + '\'' +
            ", fName='" + fName + '\'' +
            ", lName='" + lName + '\'' +
            ", id=" + id +
            '}';
  }

  /**
   * JSON String representation of the LogMessage Object
   */
  private String toJson() {
    return "{\n" +
            "\"time\": " + time +
            ",\n\"ip\": \"" + ip + "\"" +
            ",\n\"fName\": \"" + fName + "\"" +
            ",\n\"lName\": \"" + lName + "\"" +
            ",\n\"id\": " + id +
            "\n}";
  }

  /**
   * prints the LogMessage object as a JSON String
   */
  public void printLogMessage() {
    System.out.println(toJson());
  }
}
