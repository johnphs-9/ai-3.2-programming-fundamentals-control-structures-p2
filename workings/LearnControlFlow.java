package workings;

import java.util.Arrays;

public class LearnControlFlow {
  public static void main(String[] args) {
    int score = 75;

    if (score > 90) {
      System.out.println("A");
    } else if (score > 80) {
      System.out.println("B");
    } else if (score > 70) {
      System.out.println("C");
    } else {
      System.out.println("D or below");
    }

    for (int i = 1; i <= 5; i++) {
      System.out.println("i = " + i);
    }

    int i = 1;
    while (i <= 5) {
      System.out.println(i);
      i++;
    }

    for (int n = 1; n <= 10; n++) {
      String type = (n % 2 == 0) ? "even" : "odd";
      System.out.println(n + " is " + type);
    }

    int[] scores = {85, 92, 78};

    for (int s : scores) {
      System.out.println(s);
    }

    Arrays.stream(scores).forEach(s -> System.out.println(s));

    int[] amounts = {50, 120, -5, 300, 2000, 80};

    for (int amount : amounts) {
      if (amount <= 0) continue;   // skip invalid entries
      if (amount > 1000) break;    // stop at the first oversized order
      System.out.println("Processing: " + amount);
    }
  }
}
