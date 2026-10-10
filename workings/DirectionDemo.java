package workings;

public class DirectionDemo {
  public static void main(String[] args) {
    Direction dir = Direction.N;
    System.out.println("Direction: " + dir);

    Direction d = Direction.W;

    switch (d) {
      case N -> System.out.println("North");
      case E -> System.out.println("East");
      case W -> System.out.println("West");
      case S -> System.out.println("South");
    }
  }
}
