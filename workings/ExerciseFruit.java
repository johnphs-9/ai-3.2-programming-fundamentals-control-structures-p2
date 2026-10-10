package workings;

import java.util.Scanner;

public class ExerciseFruit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your favorite fruit: ");
    String fruit = scanner.nextLine();

    if (fruit.equals("apple")) {
      System.out.println("Healthy choice!");
    } else {
      System.out.println("Nice fruit!");
    }

    scanner.close();
  }
}
