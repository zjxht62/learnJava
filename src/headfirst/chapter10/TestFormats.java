package headfirst.chapter10;

import java.util.Calendar;
import java.util.Date;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/28
 */
public class TestFormats {
    public static void main(String[] args) {
        String s = String.format("%, d", 10000000);
        System.out.println(s);
        //%代表把参数放到这里
        String s1 = String.format("I have %.2f bugs to fix", 23423.3242);
        System.out.println(s1);
        String s2 = String.format("I have %,.2f bugs to fix", 23423.3242);
        System.out.println(s2);
        System.out.println(String.format("%d", 42));
        System.out.println(String.format("%.3f", 42.0000000));
        System.out.println(String.format("%x", 42));
        System.out.println(String.format("%c", 42));
        int one = 1231343;
        double two = 4214234.23442;
        System.out.println(String.format("The Rank is %,d out of %.2f", one, two));
        System.out.println(String.format("%tc", new Date()));
        System.out.println(String.format("%tr", new Date()));

        Calendar calendar = Calendar.getInstance();
        //设置时间到2004年1月7日15:40
        calendar.set(2004, 0, 7, 15, 40);
        System.out.println("calendar is  " + calendar.getTime());
        //时间转为millisecond
        long day1 = calendar.getTimeInMillis();
        //加上1小时
        day1 += 1000 * 60 * 60;
        calendar.setTimeInMillis(day1);
        System.out.println("new hour " + calendar.get(calendar.HOUR_OF_DAY));
        //加上35天
        calendar.add(calendar.DATE, 35);
        System.out.println("add 35days " + calendar.getTime());
        //滚动35天 只有日期滚动 月不动
        calendar.roll(calendar.DATE, 35);
        System.out.println("roll 35days " + calendar.getTime());
        //直接设定date
        calendar.set(calendar.DATE, 1);
        System.out.println("set to 1 " + calendar.getTime());
    }
}
