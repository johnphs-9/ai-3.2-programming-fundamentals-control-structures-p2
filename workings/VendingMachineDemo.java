package workings;

public class VendingMachineDemo {
  public static void main(String[] args) {
    VendingMachine myVendingMachine = new VendingMachine();
    myVendingMachine.makePayment(10.0);
    myVendingMachine.makePayment(EPayment.GRABPAY);
    myVendingMachine.makePayment(EPayment.FAVEPAY);
    myVendingMachine.makePayment(EPayment.PAYNOW);
  }
}
