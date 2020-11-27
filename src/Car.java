

public abstract class Car {

    public int newWeightCargo;
    public int maxPassengers;
//    public abstract int loadTheCar(int newWeightCargo);
//    public abstract int unloadTheCar(int newWeightCargo);
    public int maxWeight;
    int status;

    public abstract int getMax();
    public abstract int getStatus();
    public abstract String getName();
    public abstract void setStatus(int s);

    public abstract int loadTheCar(int cargo);

    public abstract int unLoadTheCar(int cargo);

    enum Status {
    OVERLOADED,
    EMPTY,
    WORKING
};
}