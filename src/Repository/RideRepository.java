package Repository;

import Model.CabDriver;
import Model.CabPassenger;
import Model.Ride;

import java.util.ArrayList;
import java.util.List;

public class RideRepository {
    private List<Ride> rides;

    public RideRepository() {
        this.rides = new ArrayList<>();
    }

    public void createRide(Ride ride) {
        this.rides.add(ride);
    }
}
