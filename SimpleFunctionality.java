public class SimpleFunctionality {

  // filename must have same name as class defined in file

  public static void main(String... args) {
        System.out.println("Hello, World!");
        car();
    }

    public static void car() {
      System.out.println("make a new car and make " + getNum() + " of them");
      Car car1 = new Car();
      car1.setCarName("honda civic");
      car1.speedUp();
      car1.printStates();
    }

    public static int getNum() {
      return 2;
    }


  }

