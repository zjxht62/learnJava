package OO.chapter3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/4
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {
        this.hour = (hour < 0)? 0:hour%24;
        this.minute = (minute < 0)? 0:minute%60;
        this.second = (second < 0)? 0:second%60;
    }

    public void setTime(String time) {
        this.hour = Integer.parseInt(time.substring(0, 1));
        this.hour = (this.hour < 0) ? 0 : this.hour % 24;

        this.minute = Integer.parseInt(time.substring(3, 4));
        this.minute = (this.minute < 0) ? 0 : this.minute % 60;

        this.second= Integer.parseInt(time.substring(3, 4));
        this.second = (this.minute < 0) ? 0 : this.minute % 60;

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
