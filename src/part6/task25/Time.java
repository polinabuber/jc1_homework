package part6.task25;


public final class Time {
    public static void main(String[] args) {
       Time a = new Time(20, 30, 8);
        System.out.println(a.compareTo(ofSeconds(73808)));
    }

    private final int hours;
    private final int minutes;
    private final int seconds;

    private Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int toSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public static Time ofSeconds(int seconds) {
        final int hours = seconds / 3600;
        seconds %= 3600;
        final int minutes = seconds / 60;
        seconds %= 60;
        return new Time(hours, minutes, seconds);
    }

    public int compareTo(Time o) {
        final int hoursComp = Integer.compare(hours, o.hours);
        if (hoursComp != 0) {
            return hoursComp;
        }
        final int minutesComp = Integer.compare(minutes, o.minutes);
        if (minutesComp != 0) {
            return minutesComp;
        }
        return Integer.compare(seconds, o.seconds);
    }
}
