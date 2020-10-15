package thinkinjava.chapter16_arrays;

import com.sun.jndi.ldap.Ber;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/10/14
 */
public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[])la;
        ls[0] = new ArrayList<String>();
        //编译时异常
//        ls[1] = new ArrayList<Integer>();

        //List<String> 是Object的子类
        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>();

        List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[])new List[10];
        for (int i = 0; i < spheres.length; i++) {
            spheres[i] = new ArrayList<BerylliumSphere>();
        }

    }
}
