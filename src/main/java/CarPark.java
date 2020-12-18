import java.util.ArrayList;
import java.util.List;
/*Příjezd auta (vytvoření záznamu a uloženi do seznamu)
        Odjezd auta podle RZ (odstranění ze seznamu podle RZ)
        Dotaz na zbývající kapacitu
        Dotaz na obsazenost*/

public class CarPark {
    private ArrayList<Car> listOfCars = new ArrayList<>();
    private int maxCapacity;
    private int remainingCapacity;

    CarPark(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.remainingCapacity = maxCapacity;
    }

    public List<Car> getListOfCars() {
        return listOfCars;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getRemainingCapacity() {
        return remainingCapacity;
    }


    public void addCar(Car car) {
        if (remainingCapacity == 0) {
            throw new IllegalStateException("The parking space is already full. Please try again later.");
        }
        listOfCars.add(car);
        remainingCapacity--;
        System.out.println("Car " + car.getCarId() + " arrived to the parking place.");
    }

    public void removeCar(String carId) {
        for (Car car : getListOfCars()) {
            if (car.getCarId().equals(carId)) {
                listOfCars.remove(car);
                remainingCapacity++;
                System.out.println("Car " + car.getCarId() + " has left the parking place.");
            }
        }
    }

    public boolean isFull() {
        if (remainingCapacity == 0) {
            return true;
        }
        return false;
    }


}
