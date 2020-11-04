package thinkinjava.chapter19_enumerated;

import java.util.EnumSet;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/11/4
 */
public class CarWash {
    public enum Cycle {
        UNDERBODY {
            @Override
            void action() {
                print("冲洗底盘");
            }
        }, WHEELWASH {
            @Override
            void action() {
                print("清洗轮子");
            }
        }, PREWASH {
            @Override
            void action() {
                print("预洗,先冲一下");
            }
        }, BASIC {
            @Override
            void action() {
                print("基本清洗");
            }
        }, HOTWAX {
            @Override
            void action() {
                print("打蜡");
            }
        }, RINSE {
            @Override
            void action() {
                print("冲刷");
            }
        }, BLOWDRY {
            @Override
            void action() {
                print("吹干");
            }
        };
        abstract void action();
    }
    EnumSet<Cycle> cycles = EnumSet.of(Cycle.BASIC, Cycle.RINSE);
    public void add(Cycle cycle) {
        cycles.add(cycle);
    }
    public void washCar() {
        for (Cycle c : cycles) {
            c.action();
        }
    }

    @Override
    public String toString() {
        return cycles.toString();
    }

    public static void main(String[] args) {
        CarWash wash = new CarWash();
        print(wash);
        wash.washCar();
        wash.add(Cycle.BLOWDRY);
        //重复添加的会被set的特性给忽略掉
        wash.add(Cycle.BLOWDRY);
        wash.add(Cycle.RINSE);
        wash.add(Cycle.HOTWAX);
        print(wash);
        wash.washCar();

    }
}
