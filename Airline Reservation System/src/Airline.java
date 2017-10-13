import java.util.ArrayList;

public class Airline {
    private String name;
    private int numberOfPlanes;
    ArrayList<Plane> planes = new ArrayList<Plane>(numberOfPlanes);

    public Airline() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlanes() {
        return numberOfPlanes;
    }

    public void setNumberOfPlanes(int numberOfPlanes) {
        this.numberOfPlanes = numberOfPlanes;
    }

    public void addAircraft(Plane airCraft){
        planes.add(airCraft);
    }
}
