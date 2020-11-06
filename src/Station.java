import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Station {
    public static void main(String[] args) {
        String KIA = new String("KIA");
        String Renault = new String("Renault");
        String Matiz = new String("Matiz");
        String Lada_granta = new String("Lada_granta");
        ArrayList<String> Car = new ArrayList<>(Arrays.asList(KIA, Renault, Matiz, Lada_granta));
        System.out.println(Car);


    }
   // ArrayList<PassengerCar> passengerCars = new ArrayList<>();

  /*  public  void setCargoCars (String name){
        cargoCars.add(new CargoCar(name));
    }
    public  void setPassengerCars(String name){
        passengerCars.add(new PassengerCar(name));
    }

    public ArrayList<CargoCar> getCargoCars() {
        return cargoCars;
    }

    public ArrayList<PassengerCar> getPassengerCars() {
        return passengerCars;
    }*/
}
