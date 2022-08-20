package server;
import org.joda.time.LocalTime;
import org.json.simple.JSONObject;

public class App {


  public void main(String[] args){
    // call class to start up server
    LocalTime currentTime = new LocalTime();
    JSONObject jsonObject = new JSONObject();
    String text = "Text with special character /\"\'\b\f\t\r\n.";
    System.out.println(text);
    System.out.println("After escaping.");
    text = jsonObject.escape(text);
    System.out.println(text);
    System.out.println("The current local time is: " + currentTime);
    System.out.println("server main fn.");
  }

}
