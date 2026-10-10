package workings;

public class BonusCalculator {

  // 1. Salary only — applies a standard 10% bonus
  public static double calcBonus(double salary) {
    return salary * 0.1;
  }

  // 2. Salary + custom rate
  public static double calcBonus(double salary, double rate) {
    return salary * rate;
  }

  // 3. Salary + position
  public static double calcBonus(double salary, Position position) {
    double rate = switch (position) {
      case STAFF -> 0.1;
      case MANAGER -> 0.2;
      case CEO -> 3.0;
    };
    return salary * rate;
  }
}
