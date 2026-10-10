package workings;

public class ExercisePatternMatching {
  public static void main(String[] args) {
    System.out.println(classify(42));
    System.out.println(classify(-7));
    System.out.println(classify(0));
    System.out.println(classify("hello"));
    System.out.println(classify(""));
    System.out.println(classify(null));
  }

  static String classify(Object obj) {
    return switch (obj) {
      case Integer i when i > 0 -> "Positive number";
      case Integer i when i < 0 -> "Negative number";
      case Integer i -> "Zero";
      case String s when s.isEmpty() -> "Empty string";
      case String s -> "Non-empty string";
      case null -> "Null";
      default -> "Other type";
    };
  }
}
