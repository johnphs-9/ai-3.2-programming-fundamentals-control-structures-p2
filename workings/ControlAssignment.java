package workings;

public class ControlAssignment {
  public static void main(String[] args) {

    // Problem 1: divisible by 3, 5, or both
    int[] numbers = { 9, 10, 15, 7 };
    for (int n : numbers) {
      System.out.println(n + " -> " + divisibility(n));
    }

    System.out.println();

    // Problem 2: sample budgets determine the ride
    int[] budgets = { 150, 100, 75, 50, 49, 20, 19, 0, -5 };
    for (int budget : budgets) {
      System.out.println("budget " + budget + " -> " + rideFor(budget));
    }

    System.out.println();

    // Problem 3: number 1-12 -> zodiac animal
    for (int n = 1; n <= 12; n++) {
      String sZodiac = zodiacAnimal(n) + " / " + zodiacAnimalSwitchExpression(n);

      // format sZodiac for fixed spacing of 20 characters, centered within the space
      int padding = (18 - sZodiac.length()) / 2;
      sZodiac = " ".repeat(padding) + sZodiac; // pad the left side to center the text
      sZodiac = String.format("%-" + 18 + "s", sZodiac); // pad the right side to ensure total width of 20 characters
      System.out.println(n + " ->\t(traditional switch) " + sZodiac + " (switch-expression)");
    }
  } // main

  // "both" must be checked first — in an if-else ladder the
  // first true condition wins
  private static String divisibility(int n) {
    if (n % 3 == 0 && n % 5 == 0) {
      return "divisible by both 3 and 5";
    } else if (n % 3 == 0) {
      return "divisible by 3";
    } else if (n % 5 == 0) {
      return "divisible by 5";
    } else {
      return "divisible by neither 3 nor 5";
    }
  }

  // Conditions are checked top-down, so each branch only needs its lower bound
  private static String rideFor(int budget) {
    if (budget > 100) {
      return "taxi";
    } else if (budget >= 50) {
      return "train";
    } else if (budget >= 20) {
      return "bus";
    } else if (budget >= 0) {
      return "walk";
    } else {
      return "invalid budget";
    }
  }

  // Traditional switch: each case needs a break, otherwise it falls through
  private static String zodiacAnimal(int number) {
    String animal;
    switch (number) {
      case 1:
        animal = "Rat";
        break;
      case 2:
        animal = "Ox";
        break;
      case 3:
        animal = "Tiger";
        break;
      case 4:
        animal = "Rabbit";
        break;
      case 5:
        animal = "Dragon";
        break;
      case 6:
        animal = "Snake";
        break;
      case 7:
        animal = "Horse";
        break;
      case 8:
        animal = "Goat";
        break;
      case 9:
        animal = "Monkey";
        break;
      case 10:
        animal = "Rooster";
        break;
      case 11:
        animal = "Dog";
        break;
      case 12:
        animal = "Pig";
        break;
      default:
        animal = "Invalid number";
    }
    return animal;
  }

  // switch expression (Java 14+): no need for breaks, returns a value directly
  private static String zodiacAnimalSwitchExpression(int number) {
    return switch (number) {
      case 1 -> "Rat";
      case 2 -> "Ox";
      case 3 -> "Tiger";
      case 4 -> "Rabbit";
      case 5 -> "Dragon";
      case 6 -> "Snake";
      case 7 -> "Horse";
      case 8 -> "Goat";
      case 9 -> "Monkey";
      case 10 -> "Rooster";
      case 11 -> "Dog";
      case 12 -> "Pig";
      default -> "Invalid number";
    };
  }
}
