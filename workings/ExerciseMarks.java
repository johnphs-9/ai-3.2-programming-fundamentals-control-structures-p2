package workings;

import java.util.Scanner;

public class ExerciseMarks {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your marks: ");
    int marks = scanner.nextInt();

    if (marks > 85) {
      System.out.println("Excellent");
    } else if (marks >= 70) {
      System.out.println("Good");
    } else {
      System.out.println("Needs Improvement");
    }

    scanner.close();
  }
}
