package Service;

import Model.CabPassenger;
import Repository.CabPassengerRepository;

public class CabPassengerService {
    public void addPassenger(CabPassenger cabPassenger, CabPassengerRepository cabPassengerRepository) {
        cabPassengerRepository.addCabPassenger(cabPassenger);
    }
}
