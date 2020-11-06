

public abstract class Car {
    public int max;
    public int newWeightCargo;
    public abstract int loadTheCar(int newWeightCargo);
    public abstract int unloadTheCar(int newWeightCargo);
    enum Status {
        Overloaded, Empty, Working
    };

}