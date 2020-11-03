package thinkinjava.chapter19_enumerated;

import java.util.EnumMap;
import java.util.Map;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * EnumMap的demo
 * EnumMap是一种特殊的Map,要求key必须来自一个enum
 *
 * @author trevor.zhao
 * @date 2020/11/3
 */
interface Command {
    void action();
}

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        em.put(AlarmPoints.KITCHEN, new Command() {
            @Override
            public void action() {
                print("Kitchen fire!");
            }
        });
        em.put(AlarmPoints.BATHROOM, new Command() {
            @Override
            public void action() {
                print("Bathroom alert!");
            }
        });

        for (Map.Entry<AlarmPoints, Command> e : em.entrySet()) {
            printnb(e.getKey() + ": ");
            e.getValue().action();
        }

        try {
            em.get(AlarmPoints.UTILITY).action();
        } catch (Exception e) {
            print(e);
        }

    }

}
