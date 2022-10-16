package Model;

public class Ride {
    private CabPassenger passenger;
    private CabDriver driver;
    private Boolean isCompleted;

    public Ride(CabPassenger passenger, CabDriver driver) {
        this.passenger = passenger;
        this.driver = driver;
        this.isCompleted = false;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "\npassenger=" + passenger +
                "\n, driver=" + driver +
                "\n, isCompleted=" + isCompleted +
                "\n}";
    }
}
