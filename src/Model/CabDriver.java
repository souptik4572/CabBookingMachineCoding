package Model;

public class CabDriver {
    private String name;
    private String gender;
    private int age;
    private String carName;
    private String carNumber;
    private Location currentLocation;

    // This boolean value denotes if the driver is available to take up any new ride, by default it's value is True.
    private Boolean isAvailable;

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "CabDriver{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", carName='" + carName + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public CabDriver(String name, String gender, int age, String carName, String carNumber, Location currentLocation) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.carName = carName;
        this.carNumber = carNumber;
        this.currentLocation = currentLocation;
        this.isAvailable = true;
    }
}
