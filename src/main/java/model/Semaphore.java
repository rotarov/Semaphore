package model;

/**
 * Created by user on 23.04.2017.
 */
public class Semaphore {
    public static boolean greenLight;
    public static  boolean redLight;
    public static boolean yellowLight;

    public Semaphore() {
        greenLight = false;
        redLight = false;
        redLight = false;
    }

    public void start() throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            greenLight = true;
            show();
            Thread.sleep(5000);
            yellowLight = true;show();
            Thread.sleep(1000);
            greenLight = false;
            yellowLight = false;
            redLight = true; show();
            Thread.sleep(5000);
            redLight = false; show();
            yellowLight = true;
            Thread.sleep(1000);
            yellowLight = false;
        }
    }

    public void show(){
        System.out.println("|--------|");
        System.out.println("|        |");
        if (redLight) System.out.println("|   RED  |");
        System.out.println("|        |");
        System.out.println("|--------|");
        System.out.println("|        |");
        if (yellowLight) System.out.println("| YELLOW |");
        System.out.println("|        |");
        System.out.println("|--------|");
        System.out.println("|        |");
        if (greenLight) System.out.println("|  GREEN  |");
        System.out.println("|        |");
        System.out.println("|--------|");
//        System.out.close();
    }
}
