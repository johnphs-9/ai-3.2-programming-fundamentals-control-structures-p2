package workings;

public class TrafficLightDemo {
  public static void main(String[] args) {
    for (TrafficLight light : TrafficLight.values()) {
      System.out.println(light + " -> " + actionFor(light));
    }
  }

  static String actionFor(TrafficLight light) {
    return switch (light) {
      case RED -> "Stop";
      case YELLOW -> "Caution";
      case GREEN -> "Go";
    };
  }
}
