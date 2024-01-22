import java.util.*;
import java.util.ArrayList;

public class Carwaschthread extends Thread{

    static ArrayList<String> carwash = new ArrayList<>();
    int anzahl = carwash.size();
    String[] kennz = {"DL-71DA", "DL-14FA", "G-11FA", "Vo-99TI", "S-19FT", "SH-55ER", "LL-65BH", "LA-17GU", "Batman", "Kennzeichen"};
    Random r = new Random();
    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("---------------------------------------");
            System.out.println("Das Auto " + carwash.get(0) + " hat die anlage verlassen" );
            carwash.remove(0);
        } catch (Exception e) {
            System.out.println("---------------------------------------");
            System.out.println("Kein Auto da");
        }

        if( anzahl > 0){
            System.out.println("---------------------------------------");
            System.out.println("Neues Auto tritt ein");
        }

        anzahl = carwash.size();

        for (String car : carwash) {
            System.out.println("---------------------------------------");
            System.out.println("Auto im Waschsalon: " + car);
        }

        run();

    }

    public void caradd(){
        int j = 0;
        j = r.nextInt (0, 9);
        if(carwash.size() == 10){
            System.out.println("---------------------------------------");
            System.out.println("Kein Platz mehr versuchs später");

        }else{
            Car car = new Car(kennz[j]);
            String tmp = car.getCar();
            carwash.add(tmp);
            System.out.println("---------------------------------------");
            System.out.println("Auto stellt sich an");
        }

        anzahl = carwash.size();
    }

    public void carRemove(int index){
        carwash.remove(index);
        System.out.println("---------------------------------------");
        System.out.println("Auto an der stelle " + index + " hat die Schlange verlassen");
    }
}
