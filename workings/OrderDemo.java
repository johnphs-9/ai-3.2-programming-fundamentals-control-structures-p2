package workings;

public class OrderDemo {
  public static void main(String[] args) {
    OrderStatus status = OrderStatus.SHIPPED;

    System.out.println("Current status: " + status);

    // Enums compare safely with ==
    if (status == OrderStatus.SHIPPED) {
      System.out.println("Your order is on the way!");
    }

    // Enums have a few built-in helpers
    System.out.println("Position in list: " + status.ordinal()); // 1
    System.out.println("As text: " + status.name()); // SHIPPED

    // values() returns every constant in the enum
    for (OrderStatus s : OrderStatus.values()) {
      System.out.println(s);
    }
  }
}
