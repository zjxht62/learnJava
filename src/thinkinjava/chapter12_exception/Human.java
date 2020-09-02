package thinkinjava.chapter12_exception;

/**
 * 子类的对象可以匹配父类的处理程序
 *
 * @author trevor.zhao
 * @date 2020/9/2
 */
class Annoyance extends Exception {}
class Sneeze extends Annoyance {}
public class Human {
    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }

        try {
            throw new Sneeze();
            //子类异常可以被父类异常处理程序捕获
            //catch(Annoyance e)会捕获所有Annoyance以及继承自它的异常
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
    }

}
