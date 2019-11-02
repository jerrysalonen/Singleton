package singleton;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Jerry Salonen
 */
public class DigitalClock extends Observable {
    ClockTimer timer;

    public DigitalClock() {
        timer = ClockTimer.getInstance();
    }

    public void startClock(Observable o) {
        if (o == timer) {
            timer.addObserver(new Observer() {
                @Override
                public void update(Observable o, Object arg) {
                    draw(arg);
                }
            });
            new Thread(timer).start();
        }
    }

    private void draw(Object arg) {
        System.out.println(arg);
    }
}
