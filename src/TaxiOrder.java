import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TaxiOrder extends Station {
Station station;
//    List<Car> carss = new ArrayList<>();
//    carss.addAll( List<Car> cars);

    int peopleCars;
    int cargoCars;
    int man;
    int cargo;
    Scanner sc = new Scanner(System.in);

    public void scaner() {
        System.out.println("Введите кол-во людей");
        man = sc.nextInt();
        System.out.println("Введите массу груза");
        cargo = sc.nextInt();
    }
    public void callCar(int c, int t) { //кол-во машин; тип: грузовая(2)/легковая(1)
        for (int i = 0; i < c; i++) {
            int h = 0;
            while (h == 0) {
                for (int j = 0; j < cars.size(); j++) {
                    if (t == 1 && cars.get(j).getMax() == 3500 && cars.get(j).getStatus() == 1) { //getMax() == 3500
                        System.out.println("Легковая машина " + cars.get(j).getName() + " выезжает");
                        inActiveCars.add(cars.get(j));
                        cars.get(j).setStatus(0);
                        h = 1;
                        break;
                    } else if (t == 2 && cars.get(j).getMax() == 10000 && cars.get(j).getStatus() == 1) {
                        System.out.println("Грузовая машина " + cars.get(j).getName() + " выезжает");
                        inActiveCars.add(cars.get(j));
                        cars.get(j).setStatus(0);
                        h = 1;
                        break;
                    } else if (h == 0) {
                        h = 2;

                    }
                }
            }
            if (h == 2) {
                System.out.println("ERROR");
            }
        }
    }
    public void oderCar() {
        Station stationNumberOne = new Station();
        if (man != 0 && cargo <= 3500) {
            peopleCars = man;
            if (peopleCars % 4 != 0) {
                peopleCars = peopleCars / 4 + 1;
                callCar(peopleCars, 1);
            } else if (peopleCars % 4 == 0) {
                peopleCars = peopleCars / 4;
                callCar(peopleCars, 1);
            }
        }
        if (cargo != 0 && cargo > 3500) {
            cargoCars = cargo;
            if (man != 0) {
                peopleCars = man;
                if (peopleCars % 4 != 0) {
                    peopleCars = peopleCars / 4 + 1;
                    callCar(peopleCars, 1);
                } else if (peopleCars % 4 == 0) {
                    peopleCars = peopleCars / 4;
                    callCar(peopleCars, 1);
                }
            }
            if (cargoCars % 10000 != 0) {
                cargoCars = cargoCars / 10000 + 1;
                callCar(cargoCars, 2);
            } else if (cargoCars % 10000 == 0) {
                cargoCars = cargoCars / 10000;
                callCar(cargoCars, 2);
            }
        }
    }
}




