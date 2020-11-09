import java.util.ArrayList;


public class Station {
    ArrayList<CargoCar> cargoCars = new ArrayList<>();
    ArrayList<PassengerCar> passengerCars = new ArrayList<>();

    public void setCargoCars(String name) {
        cargoCars.add(new CargoCar(name));
    }

    public void setPassengerCars(String name) {
        passengerCars.add(new PassengerCar(name));
    }

    public String[] getCargoCars() {
        String[] str = new String[cargoCars.size()];
        for (int i = 0; i < cargoCars.size(); i++) {
            String nameCar = cargoCars.get(i).getName();
            str[i] = nameCar;
            System.out.println(nameCar);
        }
        return str;
    }

    public String[] getPassengerCars() {
        String[] str1 = new String[passengerCars.size()];
        for (int i = 0; i < passengerCars.size(); i++) {
            String nameCar = passengerCars.get(i).getName();
            str1[i] = nameCar;
            System.out.println(nameCar);
        }
        return str1;

    }
}
