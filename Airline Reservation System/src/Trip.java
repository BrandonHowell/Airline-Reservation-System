public class Trip {
    private Flight flight;
    private String seatNumber;
    private double seatPrice;

    public Trip(Flight flight, String seatNumber) {
        this.flight = flight;
        this.seatNumber = seatNumber;
        seatPrice = calculateSeatPrice(seatNumber);
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    private double calculateSeatPrice(String seatNumber){
        int seatNum;

        seatNum = Integer.parseInt(seatNumber.substring(0,2));
        //System.out.print(seatNum);
        switch (seatNum) {
            case 1:
            case 2:
            case 3:
            case 4: return 900.00;
            default: return 400.00;
        }
    }
}
