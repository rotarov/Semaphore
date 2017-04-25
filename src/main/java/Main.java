import controller.SemaphoreControl;

/**
 * Created by user on 23.04.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        SemaphoreControl semaphoreControl = new SemaphoreControl();
        semaphoreControl.semaphoreWindow.init();
    }
}
