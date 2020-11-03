package thinkinjava.chapter19_enumerated;

import java.util.EnumSet;

import static net.mindview.util.Print.print;
import static thinkinjava.chapter19_enumerated.AlarmPoints.*;
/**
 * EnumSet的demo
 *
 * @author trevor.zhao
 * @date 2020/11/3
 */
public class EnumSets {
    public static void main(String[] args) {
        //empty set
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        points.add(BATHROOM);
        print(points);
        points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        print(points);
        points = EnumSet.allOf(AlarmPoints.class);
        points.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        print(points);

        points.removeAll(EnumSet.range(OFFICE1, OFFICE4));
        print(points);
        //创建一个同类型的枚举,不包含入参中的所有元素
        points = EnumSet.complementOf(points);
        print(points);

    }
}
