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
        if(hour < 0)
            this.hour = 0;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;

        if(minutes > 59)
            this.minutes = 59;
        if(minutes < 0)
            this.minutes = 0;
    }

    //1:30
    //+30min
    //60min
    public void addMinutes(int minutes) {
        int summedMinutes = this.minutes + minutes;
        if(summedMinutes > 59) {
            int hoursFromMinutes = summedMinutes/60;    //61/60 = 1; 30/60 = 0
            addHours(hoursFromMinutes);

            this.minutes = summedMinutes - hoursFromMinutes * 60;
        }
        else {
            this.minutes += minutes;
        }
    }

    //23:00
    //+2h
    //25h % 24 = 1
    //-> 1:00
    public void addHours(int hours) {
        int summedHours = this.hour + hours;
        if(summedHours > 23) {
            this.hour = summedHours % 24;
        }
        else {
            this.hour += hours;
        }
    }

    public void addClock(Clock another) {
        if(another != null)
            this.addMinutes(another.getHour() * 60 + another.getMinutes());
    }
}
