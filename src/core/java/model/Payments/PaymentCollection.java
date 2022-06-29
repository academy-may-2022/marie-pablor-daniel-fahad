package model.Payments;

public interface PaymentCollection {
    public void storePayment (Payment payment);
    public void requestRefund (Payment payment);
}
