package model.Apartment;

import java.util.List;

public interface ApartmentCollection {
    public void createApartment (Apartment apartment);
    public List<Apartment> findApartments (City city);
    public Availability getApartmentAvailability (String apartmentID);
}
