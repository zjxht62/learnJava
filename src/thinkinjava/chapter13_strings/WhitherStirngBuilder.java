package thinkinjava.chapter13_strings;

/**
 * +=和stringbuilder的效率对比
 *
 * @author trevor.zhao
 * @date 2020/9/4
 */
public class WhitherStirngBuilder {
    //这个方法在编译后,for循环体里每次循环都会生成一个stringBuilder来拼接字符串
    public String implicit(String[] fields) {
        String result = "";
        for (int i = 0; i < fields.length; i++) {
            result += fields[i];
        }
        return result;
    }
    //这个方法编译后只会产生一个stringBuilder
    public String explicit(String[] fields) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            result.append(fields[i]);
        }
        return result.toString();
    }
}
