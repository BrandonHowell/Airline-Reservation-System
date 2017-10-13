import java.util.ArrayList;

public class Passenger {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private ArrayList<Trip> flights = new ArrayList<>();

    public Passenger(String firstName, String lastName, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addFlight(Trip flight) {
        flights.add(flight);
    }

    public void getTripInfo(){
        String str = "";
        System.out.println("Name    : " + getFirstName() + " " + getLastName());
        for(int i = 0; i < flights.size(); i++) {
            System.out.println("From    : " + flights.get(i).getFlight().getDeparturePlace());
            System.out.println("To      : " + flights.get(i).getFlight().getDestination());
            System.out.println("DoD     : " + flights.get(i).getFlight().getDepartureDate());
            System.out.println("ToD     : " + flights.get(i).getFlight().getDepartureTime());
            System.out.println("Seat #  : " + flights.get(i).getSeatNumber());
            System.out.println("Carrier : " + flights.get(i).getFlight().getAssignedPlane().getCompany());
        }
        System.out.println("---- End of Itinerary ----");
    }
}
