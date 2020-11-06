import java.util.Random;

public class PassengerCar extends Car {
    int weight;
    int num;
    String name;
    Random random = new Random();

    public PassengerCar() {
        max = 3500;
        weight = random.nextInt(3500);
    }

    public PassengerCar(String name){
        this.name = name;
    }
    public Status Status() {
        Status massCar;
        if (weight> max) {
            massCar = Status.Overloaded;
        } else if (num == 0) {
            massCar = Status.Empty;
        } else {
            massCar = Status.Working;
        }
        return massCar;
    }

    @Override
    public int loadTheCar(int newWeightCargo) {
        this.weight += newWeightCargo;
        this.num = 1;
        return weight;
    }

    @Override
    public int unloadTheCar(int newWeightCargo) {
        this.weight -= newWeightCargo;
        this.num = 0;
        return weight;
    }
}
