package infrastructure.repositories;

import model.Reservations.Reservation;
import model.Reservations.ReservationsCollection;

import java.util.List;

public class MongoDBReservationsCollection implements ReservationsCollection {
    @Override
    public List<Reservation> getReservations (String apartmentID) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void createReservation (Reservation reservation) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void updateReservation (Reservation reservation) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void cancelReservation (Reservation reservation) {
        throw new UnsupportedOperationException();
    }
}
