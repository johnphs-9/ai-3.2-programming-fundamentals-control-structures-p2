package workings;

public class MyApp {
  public static void main(String[] args) {
    addNumbers(5, 10);   // calling the method
    System.out.println(add(20, 30));

    Car.aboutCar();          // static — called on the class
    Car car = new Car();
    car.drive();             // instance — called on an object
    car.startEngine();

    System.out.println(BonusCalculator.calcBonus(5000));        // uses version 1 -> 500.0
    System.out.println(BonusCalculator.calcBonus(5000, 0.2));   // uses version 2 -> 1000.0
    System.out.println(BonusCalculator.calcBonus(5000, Position.MANAGER));
  }

  public static void addNumbers(int a, int b) {
    System.out.println(a + b);
  }

  public static int add(int a, int b) {
    return a + b;
  }
}
