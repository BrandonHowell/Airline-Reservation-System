public class Main {

    public static void main(String[] args){

        Plane airCraft1 = new Plane("Delta Air Lines, Inc.");

        Airline delta = new Airline();
        delta.setName("Delta Air Lines, Inc.");
        delta.addAircraft(airCraft1);

        Flight flight1 = new Flight();
        flight1.setAssignedPlane(airCraft1);
        flight1.setDepartureDate("October 10, 2017");
        flight1.setDeparturePlace("Burlington");
        flight1.setDestination("New York City");
        flight1.setDepartureTime("10:00 am");
        flight1.setExpectedDuration("1 hour");

        Flight flight2 = new Flight();
        flight2.setAssignedPlane(airCraft1);
        flight2.setDepartureDate("October 10, 2017");
        flight2.setDeparturePlace("New York City");
        flight2.setDestination("Atlanta");
        flight2.setDepartureTime("1:00 pm");
        flight2.setExpectedDuration("1 hour");

        Passenger passenger1 = new Passenger("Brandon", "Howell", "Burlington, VT", "(781) 439-5741");
        passenger1.addFlight(new Trip(flight1, "12A"));
        passenger1.addFlight(new Trip(flight2, "15E"));

        Itinerary.printItinerary(passenger1);

    }

}
