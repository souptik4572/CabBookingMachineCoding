package Repository;

import Model.CabDriver;
import Model.CabPassenger;

import java.util.ArrayList;
import java.util.List;

public class CabDriverRepository {
    private List<CabDriver> cabDrivers;

    public CabDriverRepository() {
        this.cabDrivers = new ArrayList<>();
    }

    public List<CabDriver> getCabDrivers() {
        return cabDrivers;
    }

    public void addCabDriver(CabDriver cabDriver) {
        this.cabDrivers.add(cabDriver);
    }
}
