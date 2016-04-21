package ua.in.dergachovda.less10;

public class AlarmClock {
    private String name;

    private int hours;
    private int minutes;
    private int seconds;

    private int hoursAlarm;
    private int minutesAlarm;
    private int secondsAlarm;

    public AlarmClock() {
        name = "Default clock";
        hours = 12;
        minutes = 0;
        seconds = 0;
        hoursAlarm = minutesAlarm = secondsAlarm = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        if (hours > 23 || hours < 0)
            System.out.println("You entered the wrong hours for the " + name);
        else
            this.hours = hours;
    }

    public void setCurrentTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setAlarmTime(int hours, int minutes, int seconds) {
        hoursAlarm = hours;
        minutesAlarm = minutes;
        secondsAlarm = seconds;
    }

    public void fireAlarm() {
        System.out.println("The " + name + ": Alarm!!! Wake up!!!");
    }

    public boolean isAlarmTime() {
        return (hours == hoursAlarm && minutes == minutesAlarm && seconds == secondsAlarm);
    }

    public void printCurrentTime() {
        System.out.println(hours + " : " + minutes + " : " + seconds);
    }

}
