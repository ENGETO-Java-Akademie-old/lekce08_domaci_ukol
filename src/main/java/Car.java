import java.time.LocalDate;
import java.time.LocalTime;

public class Car {
    public enum Color { RED, GREEN, BLUE, YELOW, SILVER }

    private String carId;
    private Color color;
    private LocalDate dateOfArrival;
    private LocalTime timeOfArrival;
    private String phoneNumber;

    Car (String carId, Color color, String phoneNumber) {
        this.carId = carId;
        this.color = color;
        this.dateOfArrival = LocalDate.now();
        this.timeOfArrival = LocalTime.now();
        this.phoneNumber = phoneNumber;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public LocalDate getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(LocalDate dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public LocalTime getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(LocalTime timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
