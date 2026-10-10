package workings;

public class PatternMatchingDemo {

  public static void main(String[] args) {

    ExerciseFruit lemon = new ExerciseFruit();

    System.out.println(format(42)); // Integer: 42
    System.out.println(format("hello")); // String: HELLO
    System.out.println(format(null)); // null

    System.out.println(format(lemon));

    System.out.println(describe(-5)); // Negative integer: -5
    System.out.println(describe(0)); // Zero
    System.out.println(describe("")); // Empty string

    System.out.println(describe(lemon));
  }

  // methods live here — outside main, but inside the class
  static String format(Object obj) {
    return switch (obj) {
      case Integer i -> "Integer: " + i;
      case String s -> "String: " + s.toUpperCase();
      case null -> "null";
      default -> "Unknown type: " + obj.getClass().getName();
    };
  }

  static String describe(Object obj) {
    return switch (obj) {
      case Integer i when i < 0 -> "Negative integer: " + i;
      case Integer i when i == 0 -> "Zero";
      case Integer i -> "Positive integer: " + i;
      case String s when s.isEmpty() -> "Empty string";
      case String s -> "String: " + s.toUpperCase();
      case null -> "null";
      default -> "Unknown type: " + obj.getClass().getSimpleName();
    };
  }
}
