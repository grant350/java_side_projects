package utility;
import java.util.Scanner;

public class Input {

  public static String read(){
    Scanner scanner =  new Scanner(System.in);
    String string =  scanner.next();
    scanner.close();
    return string;
  }

}
