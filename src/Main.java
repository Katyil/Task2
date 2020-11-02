
public class Main {

    public static  void main(String[] args) {

        PassengerCar Renault = new PassengerCar();
        CargoCar kamaz = new CargoCar();

        kamaz.Load(5000);
        Renault.Load(30000);

        //Renault.weight = 2000;
        System.out.println(Renault.Status());
        System.out.println(Renault.weight);
        Renault.UnLoad();
        System.out.println(Renault.Status());


    }
}
