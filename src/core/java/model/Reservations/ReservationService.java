package model.Reservations;

import model.User.User;

import java.util.List;

public class ReservationService {
    public List<Reservation> getReservations (String apartmentID) {
        throw new UnsupportedOperationException();
    }

    public void createReservationRequest (String apartmentID, User user) {
        throw new UnsupportedOperationException();
    }

    public void confirmReservationRequest (String reservationID) {
        throw new UnsupportedOperationException();
    }

    public void cancelReservation (String reservationID) {
        throw new UnsupportedOperationException();
    }

    public void setReservationAsPaid (String reservationID) {
        throw new UnsupportedOperationException();
    }
}
