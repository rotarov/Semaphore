package controller;

import model.Semaphore;
import view.SemaphoreWindow;

/**
 * Created by user on 23.04.2017.
 */
public class SemaphoreControl {
    public static Semaphore semaphore;
    public SemaphoreWindow semaphoreWindow;

    public SemaphoreControl() throws InterruptedException {
        semaphore = new Semaphore();
        semaphore.start();
        semaphoreWindow = new SemaphoreWindow(semaphore);
    }

    public void view(){

    }


}
