import java.util.Random;

public class PassengerCar extends Car {
    int weight;
    Random random = new Random();

    public PassengerCar() {
        max = 3500;
        weight = random.nextInt(3500);
    }

    @Override
    public String Status() {
        if(weight + cargo > max) {
            Status = "Overloaded";
        }
        else  if ( cargo == 0) {
            Status = "Empty";
        }
        else {
            Status = "Working";
        }
        return  Status;
    }

    @Override
    public int Load(int cargo) {
        this.cargo = cargo;
        return cargo;
    }

    @Override
    public int UnLoad() {
        cargo = 0;
        return cargo;
    }
}