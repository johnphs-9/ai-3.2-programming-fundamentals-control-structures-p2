package workings;

public class ExerciseSalaryBonus {
  public static void main(String[] args) {
    double[] worker1 = {4000, 4100, 4200, 4300, 4400, 4500};
    double[] worker2 = {5000, 5200, 5400};

    System.out.println("worker1 bonus: " + calcBonus(worker1));
    System.out.println("worker2 bonus: " + calcBonus(worker2));
    System.out.println("single salary bonus: " + calcBonus(4000));
  }

  public static double calcBonus(double salary) {
    return salary * 0.1;
  }

  public static double calcBonus(double[] monthlySalaries) {
    if (monthlySalaries.length < 6) {
      return 0;
    }
    double sum = 0;
    for (double salary : monthlySalaries) {
      sum += salary;
    }
    return (sum / monthlySalaries.length) * 0.1;
  }
}
