package OO.chapter3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/2
 */
public class TestInClass
{
    public static void main(String[] args)
    {
        OutClass outClass = new OutClass();
        outClass.createInObject();
        OutClass.InClass inClass = outClass.new InClass();
        inClass.printCount();
    }
}

    class OutClass {
        int count;

        class InClass {
            void printCount() {
                System.out.println("count: " + (++count));
            }
        }

            void createInObject() {
                InClass in = new InClass();
                in.printCount();
            }
        }


