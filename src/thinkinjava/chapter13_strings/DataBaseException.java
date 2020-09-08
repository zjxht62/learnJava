package thinkinjava.chapter13_strings;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/9/4
 */
public class DataBaseException extends Exception{
    public DataBaseException(int transactionID, int queryID, String message) {
        super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
    }

    public static void main(String[] args) {
        try {
            throw new DataBaseException(3 ,7, "Write Faild");
        } catch (DataBaseException e) {
            System.out.println(e.getMessage());
        }
    }
}
