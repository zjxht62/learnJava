package thinkinjava.chapter16_arrays;//: arrays/ThreeDWithNew.java
import java.util.*;

//初始化一个三维数组
public class ThreeDWithNew {
  public static void main(String[] args) {
    // 3-D array with fixed length:
    int[][][] a = new int[2][2][4];
    System.out.println(Arrays.deepToString(a));
//    test(1);
//    test(1, 2, 3);
      List<String> strings = new ArrayList<>();
      strings.addAll(Arrays.asList("a", "b", "c"));
      Iterator<String> stringIterator = strings.iterator();
      while (stringIterator.hasNext()) {
        System.out.println(stringIterator.next());
      }
  }
//  public static void test(int a, int... ints) {
//    System.out.println(a + " " + Arrays.toString(ints));
//  }
} /* Output:
[[[0, 0, 0, 0], [0, 0, 0, 0]], [[0, 0, 0, 0], [0, 0, 0, 0]]]
*///:~
