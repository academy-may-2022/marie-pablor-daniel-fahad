package infrastructure.repositories;

import model.Payments.Payment;
import model.Payments.PaymentCollection;

public class MongoDBPaymentCollection implements PaymentCollection {
    @Override
    public void storePayment (Payment payment) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void requestRefund (Payment payment) {
        throw new UnsupportedOperationException();
    }
}
