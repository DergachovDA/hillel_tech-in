package ua.in.dergachovda.less10;

public class Main {

    public static void main(String[] args) {

        AlarmClock clock = new AlarmClock();
        clock.setName("Alarm clock");

        clock.setCurrentTime(18, 15, 30);
        clock.setAlarmTime(18, 15, 30);

        clock.setHours(99);
        clock.printCurrentTime();

        if (clock.isAlarmTime()) clock.fireAlarm();


    }

}
