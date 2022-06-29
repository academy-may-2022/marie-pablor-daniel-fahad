package infrastructure.repositories;

import model.Apartment.Apartment;
import model.Apartment.ApartmentCollection;
import model.Apartment.Availability;
import model.Apartment.City;

import java.util.List;

public class MongoDBApartmentCollection implements ApartmentCollection {
    @Override
    public void createApartment (Apartment apartment) {
        throw new UnsupportedOperationException();
    }
    @Override
    public List<Apartment> findApartments (City city) {
        throw new UnsupportedOperationException();
    }
    @Override
    public Availability getApartmentAvailability (String apartmentID) {
        throw new UnsupportedOperationException();
    }
}
