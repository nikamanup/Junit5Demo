package org.example;

public class EconomyFlightManagement extends Flight{

    public EconomyFlightManagement(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        return passengerList.add(passenger);
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        if(!passenger.isVip()) {
            return passengerList.remove(passenger);
        }
        return false;
    }
}
