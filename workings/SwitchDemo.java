package workings;

public class SwitchDemo {
  public static void main(String[] args) {
    String direction = "N";

    switch (direction) {
      case "N":
        System.out.println("North");
        break;
      case "E":
        System.out.println("East");
        break;
      default:
        System.out.println("Invalid input");
    }

    direction = "E";

    switch (direction) {
      case "N" -> System.out.println("North");
      case "E" -> System.out.println("East");
      case "S" -> System.out.println("South");
      default -> System.out.println("Invalid input");
    }

    switch (direction) {
      case "N", "E", "W", "S" -> System.out.println("You have chosen a valid direction");
      default -> System.out.println("Invalid input");
    }

    int rating = 5;

    String feedback = switch (rating) {
      case 1, 2, 3 -> "Poor";
      case 4 -> "Good";
      case 5 -> "Excellent";
      default -> {
        yield "Invalid rating: " + rating;
      }
    };

    System.out.println(feedback);

    System.out.println(getQuarter("March"));
    System.out.println(getQuarter("July"));
    System.out.println(getQuarter("December"));
    System.out.println(getQuarter("Foo"));
  }

  // Activity: month name -> quarter
  static String getQuarter(String month) {
    return switch (month) {
      case "January", "February", "March" -> "Q1";
      case "April", "May", "June" -> "Q2";
      case "July", "August", "September" -> "Q3";
      case "October", "November", "December" -> "Q4";
      default -> "Invalid month: " + month;
    };
  }
}
