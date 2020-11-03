package thinkinjava.chapter19_enumerated;

import java.text.DateFormat;
import java.util.Date;

/**
 * 枚举类的方法,
 * 程序员可以为enum编写方法,从而为每个enum实例赋予各自不同的行为.
 *
 * @author trevor.zhao
 * @date 2020/11/3
 */
public enum ConstantSpecificMethod {
    DATE_TIME {
        String getInfo() {
           return DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH {
        @Override
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },
    VERSION {
        @Override
        String getInfo() {
            return System.getProperty("java.version");
        }
    };
    abstract String getInfo();

    public static void main(String[] args) {
        for (ConstantSpecificMethod csm : values()) {
            System.out.println(csm.getInfo());
        }
    }
}
