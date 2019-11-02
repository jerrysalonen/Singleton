package singleton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DigitalClock dc = new DigitalClock();
        ClockTimer ct = ClockTimer.getInstance();

        Scanner sc = new Scanner(System.in);

        System.out.println("Set hours: ");
        int hour = Integer.parseInt(sc.nextLine());
        ct.setHour(hour);

        System.out.println("Set minutes: ");
        int minute = Integer.parseInt(sc.nextLine());
        ct.setMinute(minute);

        System.out.println("Set seconds: ");
        int second = Integer.parseInt(sc.nextLine());
        ct.setSecond(second);

        dc.startClock(ct);
    }
}
