package headfirst.chapter14;

import java.io.Serializable;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/31
 */
public class Chat implements Serializable {
    //transient标记表示为不需要序列化的
    transient String currentID;

    String userName;
}
