package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class FlightTest {

    @BeforeAll
    public static void init(){

    }

    @Test
    @DisplayName("Early Test")
    public void TestFlight(){
       Flight flight=new EconomyFlightManagement("1");
        Passenger passenger1=new Passenger("anup",true);
        Passenger passenger2=new Passenger("dip",false);
       flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);

        assertEquals(false, flight.addPassenger(passenger1));
        assertEquals(false, flight.removePassenger(passenger1));
        assertEquals(false, flight.addPassenger(passenger2));
        assertEquals(true, flight.removePassenger(passenger2));
        Flight flight1=new BusinessFlightManagement("Business");
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(false, flight1.addPassenger(passenger1));
        assertEquals(false, flight1.removePassenger(passenger1));
        assertEquals(false, flight1.addPassenger(passenger2));
        assertEquals(false, flight1.removePassenger(passenger2));

    }

    @DisplayName("One once passager is added")
    @RepeatedTest(5)
    public void testEconomyFlightUserPassengerAddedOnlyOnce(RepetitionInfo repetitionInfo){
       Flight flight1=new EconomyFlightManagement("3");
        Passenger passenger1=new Passenger("anup",false);
        for(int i =0;i<repetitionInfo.getCurrentRepetition();i++){
       flight1.addPassenger(passenger1);
        }
        assertAll("Verify Usual Passanger can be added only once",
                ()->assertEquals(1,flight1.getPassengerList().size()),
                ()->assertTrue(flight1.getPassengerList().contains(passenger1)));
    }

    @Nested
    @DisplayName("When we Have a VIP passanger")
    class VipPassanger{
        Flight flightnew=new EconomyFlightManagement("1");
        @Test
        @DisplayName("Then You can add him and can not remove him from an economy flight")
        public void testEconomyFlightVipPassanger(){

            assertAll("Verify Usual Passanger can be added only once",
                    ()->assertEquals("1",flightnew.getId()));
        }

    }
}
