package thinkinjava.chapter16_arrays;

import net.mindview.util.Generator;

import javax.tools.JavaCompiler;

/**
 * 计数生成器
 *
 * @author trevor.zhao
 * @date 2020/10/15
 */
public class CountingGenerator {
    public static class Boolean implements Generator<java.lang.Boolean> {
        private boolean value = false;
        @Override
        public java.lang.Boolean next() {
            value = !value;
            return value;
        }
    }
}
