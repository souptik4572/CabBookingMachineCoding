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

    // This function is responsible for calculating if any ride is within reach of the source destination
    // This function is calculating the distance between two points, here the two points are thought to be placed in a X and Y axis
    // If the distance is less than 5 only then the driver would be able to reach the passenger, otherwise not and hence the checking is being made that distance is less than 5
    public Boolean isWithinReach(Location passenger, Location driver) {
        // The formula being used is distance = Squaroot of ((x1 - x2) ^ 2 + (y1 - y2) ^ 2)
        return Math.floor(Math.sqrt(Math.pow(passenger.getX() - driver.getX(), 2) + Math.pow(driver.getY() - passenger.getY(), 2))) <= 5;
    }

    public List<CabDriver> findRides(CabPassenger passenger, Location source, Location destination, CabDriverRepository cabDriverRepository) {
        List<CabDriver> allDrivers = cabDriverRepository.getCabDrivers();
        List<CabDriver> availableCabDrivers = allDrivers.stream()
                .filter(driver -> driver.getIsAvailable()) // The first filter denotes that the driver is still available
                .filter(driver -> this.isWithinReach(source, driver.getCurrentLocation())) // The second filter verifies that the driver is within reach of the passenger
                .collect(Collectors.toList());
        return availableCabDrivers;
    }

    public void chooseRide(CabPassenger passenger, CabDriver driver, RideRepository rideRepository) {
        rideRepository.createRide(new Ride(passenger, driver));
        driver.setIsAvailable(false);
    }
}
