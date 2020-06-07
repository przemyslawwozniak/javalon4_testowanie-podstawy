package pl.sda.clockex;

public class Clock {

    private int hour, minutes; //0

    public Clock() {}

    public Clock(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHour(int hour) {
        this.hour = hour;

        if(hour > 23)
            this.hour = 23;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void addMinutes(int minutes) {
        this.minutes += minutes;
    }

    public void addClock(Clock another) {

    }
}
