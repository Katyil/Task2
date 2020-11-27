import java.util.Random;

public class CargoCar extends Car {
    int weight;
    String name;
    public int maxWeight;
    int num = 0;
    int status;
    Random random = new Random();
    public CargoCar(String name) {
        this.name = name;
        status = 1;
        maxWeight = 10000;
        weight = random.nextInt(10000);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int s){
        this.status = s;
    }


    public String getName(){
        return name;
    }


    public int getMax(){
        return maxWeight;
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
        this.num =1;
        return weight;
    }

    @Override
    public int unLoadTheCar(int cargo) {
        this.weight -= cargo;
        this.num = 0;
        return weight;
    }
}

//public class CargoCar extends Car {
//
//
//
//        int maxWeight;
//        int num = 0;
//        String name;
//
//       public int getMaxWeight() {
//           return maxWeight;
//       }
//
//    public void setmaxWeight(int maxWeightCar) {
//        maxWeight.maxWeightCar = 3500;
//    }
//    public CargoCar() {
//
////        public CargoCar(String name){
////            this.name = name;
////    }
////    public String getName(){
////        return this.name;
////}
//        public Status Status() {
//            Status massCar;
//                if(weight > max) {
//                massCar = Status.Overloaded;
//                }
//                else  if ( num == 0) {
//                 massCar = Status.Empty;
//                }
//                else {
//                massCar = Status.Working;
//                }
//                return massCar;
//            }
//
//    @Override
//    public int loadTheCar(int newWeightCargo) {
//        this.weight += newWeightCargo;
//        this.num = 1;
//        return weight;
//    }
//
//        @Override
//        public int unloadTheCar(int newWeightCargo) {
//            this.weight -= newWeightCargo;
//            this.num = 0;
//            return weight;
//        }
//    }


