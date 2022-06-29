package model.Reservations;

import java.util.List;

public interface ReservationsCollection {
    public List<Reservation> getReservations (String apartmentID);
    public void createReservation (Reservation reservation);
    public void updateReservation (Reservation reservation);
    public void cancelReservation (Reservation reservation);
}
