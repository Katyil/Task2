import java.util.Random;

public class CargoCar extends Car {

        int weight;
        Random random = new Random();

    public CargoCar() {
            max = 10000;
            weight = random.nextInt(10000);
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


