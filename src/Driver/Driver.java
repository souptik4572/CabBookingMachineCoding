package Driver;

import Model.*;
import Repository.*;
import Service.CabDriverService;
import Service.CabPassengerService;
import Service.RideService;

import java.io.IOException;

public class Driver {


    public static void main(String[] args) throws IOException {

        CabPassenger cabPassenger1 = new CabPassenger("Abhishek", "Male", 23);
        CabPassenger cabPassenger2 = new CabPassenger("Rahul", "Male", 29);
        CabPassenger cabPassenger3 = new CabPassenger("Nandini", "Female", 22);

        Location locationCabDriver1 = new Location(10, 1);
        CabDriver cabDriver1 = new CabDriver("Driver1", "Male", 22, "Swift", "KA-01-12345", locationCabDriver1);
        Location locationCabDriver2= new Location(11, 10);
        CabDriver cabDriver2 = new CabDriver("Driver2", "Male", 29, "Swift", "KA-01-54321", locationCabDriver2);
        Location locationCabDriver3 = new Location(5, 3);
        CabDriver cabDriver3 = new CabDriver("Driver3", "Male", 24, "Swift", "KA-01-76898", locationCabDriver3);


        CabPassengerRepository cabPassengerRepository = new CabPassengerRepository();
        CabDriverRepository cabDriverRepository = new CabDriverRepository();

        CabPassengerService cabPassengerService = new CabPassengerService();

        cabPassengerService.addPassenger(cabPassenger1, cabPassengerRepository);
        cabPassengerService.addPassenger(cabPassenger2, cabPassengerRepository);
        cabPassengerService.addPassenger(cabPassenger2, cabPassengerRepository);

        CabDriverService cabDriverService = new CabDriverService();

        cabDriverService.addDriver(cabDriver1, cabDriverRepository);
        cabDriverService.addDriver(cabDriver2, cabDriverRepository);
        cabDriverService.addDriver(cabDriver3, cabDriverRepository);

        RideService rideService = new RideService();

        RideRepository rideRepository = new RideRepository();

        System.out.println(rideService.findRides(
                cabPassenger2,
                new Location(10, 0),
                new Location(15, 3),
                cabDriverRepository));

        rideService.chooseRide(cabPassenger2, cabDriver1, rideRepository);

        System.out.println("The list of available Drivers: " + cabDriverRepository.getCabDrivers().toString());
    }












}
