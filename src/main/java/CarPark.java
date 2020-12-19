import java.util.ArrayList;
import java.util.List;
/*Příjezd auta (vytvoření záznamu a uloženi do seznamu)
        Odjezd auta podle RZ (odstranění ze seznamu podle RZ)
        Dotaz na zbývající kapacitu
        Dotaz na obsazenost*/

public class CarPark {
    private ArrayList<Car> listOfCars;
    private int maxCapacity;
    private int remainingCapacity;

    CarPark(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.remainingCapacity = maxCapacity;
        this. listOfCars = new ArrayList<>();
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
        for (int i = 0; i < listOfCars.size(); i++) { {
            if (listOfCars.get(i).getCarId().equals(carId)) {
            }
                remainingCapacity++;
                System.out.println("Car " + listOfCars.get(i).getCarId() + " has left the parking place.");
                listOfCars.remove(listOfCars.get(i));
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
