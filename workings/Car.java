package workings;

public class Car {
  public static void aboutCar() {
    System.out.println("Cars have 4 wheels.");
  }

  public void drive() {
    System.out.println("Car is moving.");
  }

  private void startAircon() {
    System.out.println("💨 Aircon started!");
  }

  private void startRadio() {
    System.out.println("📻 Radio started!");
  }

  private void checkSeatBelts() {
    System.out.println("🪑 Seat belts checked!");
  }

  public void startEngine() {
    System.out.println("🚗 Starting engine...");
    System.out.println("✅ Engine started!");
    startAircon();
    startRadio();
    checkSeatBelts();
  }
}
