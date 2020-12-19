import org.junit.jupiter.api.*;

public class CarParkTest {
    CarPark parking;
    Car car1, car2, car3;

    @BeforeEach
    void init() {
        parking = new CarPark(2);
        car1= new Car("ABCD55", Car.Color.BLUE, "111555");
        parking.addCar(car1);
    }

    @Test
    void addCar(){
        car2 = new Car("EFGH11", Car.Color.SILVER, "333222");
        parking.addCar(car2);
        boolean isAdded = false;
        for (Car car : parking.getListOfCars()) {
            if (car.getCarId().equals(car2.getCarId())) {
                isAdded = true;
            }
        }
        Assertions.assertEquals(true, isAdded);
    }

    @Test
    void addCar2() {
        car2 = new Car("EFGH11", Car.Color.SILVER, "333222");
        parking.addCar(car2);
        car3 = new Car("IJKL88", Car.Color.RED, "777444");
        Assertions.assertThrows(IllegalStateException.class, () -> parking.addCar(car3));
    }

    @Test
    void removeCar() {
        boolean isDeleted = true;
        parking.removeCar(car1.getCarId());
        for (Car car : parking.getListOfCars()) {
            if (car.getCarId().equals(car1.getCarId())) {
                isDeleted = false;
            }
        }
        Assertions.assertEquals(true, isDeleted);
    }

    @Test
    void getRemainingCapacity() {
        int remainingCapacity = parking.getRemainingCapacity();
        Assertions.assertEquals(1, remainingCapacity);
    }

    @Test
    void isFull() {
        car2 = new Car("EFGH11", Car.Color.SILVER, "333222");
        parking.addCar(car2);
        boolean status = parking.isFull();
        Assertions.assertEquals(true, status);
    }
}
