package org.example;

public class BusinessFlightManagement extends Flight {


    public BusinessFlightManagement(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        if(passenger.isVip()) {
            return passengerList.add(passenger);
        }
        return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        return false;
    }
}
