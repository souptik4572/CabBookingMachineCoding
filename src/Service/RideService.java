package Service;

import Model.CabDriver;
import Model.CabPassenger;
import Model.Location;
import Model.Ride;
import Repository.CabDriverRepository;
import Repository.RideRepository;

import java.util.List;
import java.util.stream.Collectors;

public class RideService {

    public Boolean isWithinReach(Location passenger, Location driver) {
        return Math.floor(Math.sqrt(Math.pow(passenger.getX() - driver.getX(), 2) + Math.pow(driver.getY() - passenger.getY(), 2))) <= 5;
    }

    public List<CabDriver> findRides(CabPassenger passenger, Location source, Location destination, CabDriverRepository cabDriverRepository) {
        List<CabDriver> allDrivers = cabDriverRepository.getCabDrivers();
        List<CabDriver> availableCabDrivers = allDrivers.stream()
                .filter(driver -> driver.getIsAvailable())
                .filter(driver -> this.isWithinReach(source, driver.getCurrentLocation()))
                .collect(Collectors.toList());
        return availableCabDrivers;
    }

    public void chooseRide(CabPassenger passenger, CabDriver driver, RideRepository rideRepository) {
        rideRepository.createRide(new Ride(passenger, driver));
        driver.setIsAvailable(false);
    }
}
