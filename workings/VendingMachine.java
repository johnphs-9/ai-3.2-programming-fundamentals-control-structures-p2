package workings;

public class VendingMachine {
  public void makePayment(double amount) {
    System.out.println("Cash payment of $" + amount + " accepted.");
  }

  public void makePayment(EPayment payment) {
    boolean success = switch (payment) {
      case PAYNOW -> connectPayNow();
      case GRABPAY -> connectGrabPay();
      case FAVEPAY -> connectFavePay();
    };
    System.out.println(success ? payment + " payment successful." : payment + " payment failed.");
  }

  private boolean connectFavePay() {
    System.out.println("Connecting to FavePay...");
    return false;
  }

  private boolean connectPayNow() {
    System.out.println("Connecting to PayNow...");
    return true;
  }

  private boolean connectGrabPay() {
    System.out.println("Connecting to GrabPay...");
    return true;
  }

}
