package Repository;

import Model.CabPassenger;

import java.util.ArrayList;
import java.util.List;

public class CabPassengerRepository {
    private List<CabPassenger> cabPassengers;

    public CabPassengerRepository() {
        this.cabPassengers = new ArrayList<>();
    }

    public List<CabPassenger> getCabPassengers() {
        return cabPassengers;
    }

    public void addCabPassenger(CabPassenger cabPassenger) {
        this.cabPassengers.add(cabPassenger);
    }
}
