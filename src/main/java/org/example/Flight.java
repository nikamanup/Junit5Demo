package org.example;

import java.util.*;

public abstract class Flight {
   /* private String flightType;*/
    private String id;

     Set<Passenger> passengerList=new HashSet<>();
    public Flight(String id){
        this.id=id;
    }

    public String getId() {
        return id;
    }


/*public Flight(String flightType){
        this.flightType=flightType;
        passengerList=new ArrayList<>();
    }*/

    public abstract boolean addPassenger(Passenger passenger);/*{
    switch (flightType){
        case "Economy":
                return passengerList.add(passenger);
        case "Business":
            if(passenger.isVip()) {
                return passengerList.add(passenger);
            }
            return false;
        default: throw new RuntimeException("Unknown Flight Type"+flightType);
    }

    }*/

    public abstract boolean removePassenger(Passenger passenger);/*{
        switch (flightType){
            case "Economy":
                if(!passenger.isVip()) {
                    return passengerList.remove(passenger);
                }
                return false;
            case "Business":
                return false;
            default: throw new RuntimeException("Unknown Flight Type"+flightType);
        }

    }*/

    public Set<Passenger> getPassengerList() {
        return Collections.unmodifiableSet(passengerList);
    }

    public void setPassengerList(Set<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
}
