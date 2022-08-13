

public class Car implements CarInterface {
  int speed = 0;
  int gear = 1;
  String carname = "noname";

  int[] array =  new int[10];

  public void setCarName(String name) {
    carname = name;
  }
  public void downGear() {
    gear -= 1;
  }

  public void upGear() {
    gear += 1;
  }

  public void speedUp() {
    speed += 1;
  }
  public void speedDown() {
    speed -= 1;
  }

  public void applyBrakes() {
    speed = 0;
    gear = 1;
  }

  void printStates() {
    System.out.println(
       " gear: " +
        gear + " speed: " + speed + "carname: " + carname);
  }


}
