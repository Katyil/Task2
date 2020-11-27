import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaxiOrder Oder = new TaxiOrder();
        Station stationNumberOne = new Station();
        stationNumberOne.setСars("Kamaz" , 2);
        stationNumberOne.setСars("Tesla" , 1);
        stationNumberOne.setСars("Ural" , 2);
        stationNumberOne.setСars("Toyota" , 1);
        stationNumberOne.setСars("Kia" , 1);
        stationNumberOne.setСars("Kamaz2" , 2);
      Oder.scaner();
      Oder.oderCar();

//        Station stationNumberOne = new Station();
//        stationNumberOne.setСars("Kamaz" , 2);
//        stationNumberOne.setСars("Tesla" , 1);
//        stationNumberOne.setСars("Ural" , 2);
//        stationNumberOne.setСars("Toyota" , 1);
//        stationNumberOne.setСars("Kia" , 1);
//        stationNumberOne.setСars("Kamaz2" , 2);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите кол-во людей");
//        int man = sc.nextInt();
//        System.out.println("Введите массу груза");
//        int cargo = sc.nextInt();
//
//        int peopleCars;
//        int cargoCars;
//
//        if (man != 0 && cargo <= 3500)  {
//            peopleCars = man;
//            if (peopleCars % 4 != 0) {
//                peopleCars = peopleCars / 4 + 1;
//                stationNumberOne.callCar(peopleCars, 1);
//            } else if (peopleCars % 4 == 0) {
//                peopleCars = peopleCars / 4;
//                stationNumberOne.callCar(peopleCars, 1);
//            }
//        }
//        if (cargo != 0 && cargo > 3500) {
//            cargoCars = cargo;
//            if(man !=0){
//                peopleCars = man;
//                if (peopleCars % 4 != 0) {
//                    peopleCars = peopleCars / 4 + 1;
//                    stationNumberOne.callCar(peopleCars, 1);
//                } else if (peopleCars % 4 == 0) {
//                    peopleCars = peopleCars / 4;
//                    stationNumberOne.callCar(peopleCars, 1);
//                }
//            }
//            if (cargoCars % 10000 != 0) {
//                cargoCars = cargoCars / 10000 + 1;
//                stationNumberOne.callCar(cargoCars , 2);
//            } else if (cargoCars % 10000 == 0) {
//                cargoCars = cargoCars / 10000;
//                stationNumberOne.callCar(cargoCars , 2);
//            }
//        }
    }
}

//
//                int peopleCars;
//                int cargoCars;
//                if(matcher.find()){
//                    peopleCars = Integer.parseInt(matcher.group());
//                    if(peopleCars%4 != 0) {
//                        peopleCars = peopleCars/4 + 1;
//                    } else if(peopleCars%4 == 0){
//                        peopleCars = peopleCars/4;
//                    }
//
//                    if(matcher.find()){
//                        cargoCars = Integer.parseInt( matcher.group());
//                        if(cargoCars%3500 != 0){
//                            cargoCars = cargoCars/3500 + 1;
//                        } else if(cargoCars%3500 == 0) {
//                            cargoCars = cargoCars/3500;
//                        }
//                        System.out.println(peopleCars + cargoCars);
//                        JOptionPane.showMessageDialog(null,"Заказано " + String.valueOf(peopleCars + cargoCars) + " легковых машины");
//                    }
//                }
//            }
//        });
//    }
//}