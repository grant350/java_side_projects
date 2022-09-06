package core;
import org.joda.time.LocalTime;
import com.cedarsoftware.util.io.JsonWriter;
public class App {


  public static void main(String[] args){
    // call class to start up server


/*
methods on building json objects
constructor variables
> obj // jsonstring of obj
> java obj


remove()
createFromText
main() makes empty {};

*/

    class User {
      private  int age ;
      private String gender;
      private String city;
      private Un nestedObj;

      public User(int a, String b, String c, int d){
        age = a;
        gender = b;
        city = c;
        nestedObj = new Un(d);
      }

      class Un {
        private int number;
        public Un(int a){
          number = a;
        }
      }
    }
    User user1 = new User(22, "male","phoenix",44);

    String json = JsonWriter.objectToJson(user1);

    System.out.println(json);

    LocalTime currentTime = new LocalTime();
    String text = "Text with special character";
    System.out.println(text);
    System.out.println("The current local time is: " + currentTime);
    System.out.println("server main fn.");
  }

}
