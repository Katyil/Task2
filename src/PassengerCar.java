import java.util.Random;

public class PassengerCar extends Car {
    int weight;
    String name;
    int maxPassangers;
    int maxWeight;
    int num = 0;
    int status;
    public PassengerCar(String name) {
        this.name = name;
        status = 1;
        maxPassangers = 4;
        maxWeight = 3500;
        Random random = new Random();
        weight = random.nextInt(3500);
    }

    public int getMax() {
        return maxWeight;
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int s) {
        this.status = status;
    }
    // public PassengerCar(String name){
    //     this.name = name;
    // }

    public String getName() {
        return name;
    }

    public Status Status() {
        Status massCar;
        if (weight> maxWeight) {
            massCar = Status.OVERLOADED;
        } else if (num == 0) {
            massCar = Status.EMPTY;
        } else {
            massCar = Status.WORKING;
        }
        return massCar;
    }

    @Override
    public int loadTheCar(int cargo) {
        this.weight += cargo;
        this.num = 1;
        return weight;
    }

    @Override
    public int unLoadTheCar(int cargo) {
        this.weight -= cargo;
        this.num = 0;
        return weight;
    }
}
//import java.util.Random;
//
//public class PassengerCar extends Car {
//public PassengerCar() {
//             //max = 3500;
//               maxPassengers = 4;
//               maxWeight = 3500;
//               max = 10000;
//               Random random = new Random();
//        //weight = random.nextInt(3500);
//        }
//
//public Status Status() {
//    Status massCar;
//
//          if (maxWeight > maxWeight) {
//             massCar = Status.OVERLOADED;
//        } else if (maxWeight == 0) {
//             massCar = Status.EMPTY;
//        } else {
//             massCar = Status.WORKING;
//        }
//        return massCar;
//    }
//}
//import java.util.Random;
//
//public class PassengerCar extends Car {
//    int weight;
//    int num;
//    String name;
//    Random random = new Random();
//
//    public PassengerCar() {
//        max = 3500;
//        weight = random.nextInt(3500);
//    }
//
//    public PassengerCar(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//    public Status Status() {
//        Status massCar;
//        if (weight> max) {
//            massCar = Status.Overloaded;
//        } else if (num == 0) {
//            massCar = Status.Empty;
//        } else {
//            massCar = Status.Working;
//        }
//        return massCar;
//    }
//
//    @Override
//    public int loadTheCar(int newWeightCargo) {
//        this.weight += newWeightCargo;
//        this.num = 1;
//        return weight;
//    }
//
//    @Override
//    public int unloadTheCar(int newWeightCargo) {
//        this.weight -= newWeightCargo;
//        this.num = 0;
//        return weight;
//    }
//}
