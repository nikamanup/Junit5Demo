package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Passenger passenger1=new Passenger("anup",true);
        Passenger passenger2=new Passenger("dip",false);
        Flight economy=new EconomyFlightManagement("1");
        Flight business=new BusinessFlightManagement("2");
        economy.addPassenger(passenger1);
        economy.addPassenger(passenger2);
        business.addPassenger(passenger1);
        business.addPassenger(passenger2);
        System.out.println("Passenger List in Economy: "+economy.getPassengerList());
        System.out.println("Passanger List in Business: "+business.getPassengerList());
    }
}
