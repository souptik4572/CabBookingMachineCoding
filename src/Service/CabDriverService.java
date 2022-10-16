package Service;

import Model.CabDriver;
import Repository.CabDriverRepository;

import java.util.List;

public class CabDriverService {
    public void addDriver(CabDriver cabDriver, CabDriverRepository cabDriverRepository) {
        cabDriverRepository.addCabDriver(cabDriver);
    }
}
