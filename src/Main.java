import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner leser = new Scanner(System.in);
        boolean gameOn = true;

        Carwaschthread carthread = new Carwaschthread();
        carthread.start();

        while(gameOn){
            System.out.println("Autowaschanlage");
            System.out.println("Auto Erstellen - 1 | Auto an pos entfernen - 2 | Beenden - 3");
            int auswahl = leser.nextInt();
            if(auswahl == 1){
                carthread.caradd();
                System.out.println("Auto wurde hinzugefügt");
                System.out.println("---------------------------------------");
            }else if(auswahl == 2){
                System.out.println("Index eingeben");
                System.out.println("---------------------------------------");
                int index = leser.nextInt();
                carthread.carRemove(index);
            }else{
                gameOn = false;
            }
        }
    }
}
