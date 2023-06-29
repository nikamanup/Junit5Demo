package org.example;

public class PremiumFlightManagement extends Flight{
    public PremiumFlightManagement(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        return false;
    }
}
