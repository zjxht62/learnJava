package thinkinjava.chapter17_containers;

import java.lang.ref.*;
import java.util.LinkedList;
import java.util.zip.ZipEntry;

/**
 * 对象引用的Demo
 *
 * @author trevor.zhao
 * @date 2020/10/28
 */
class VeryBig {
    private static final int SIZE = 10000;
    private long[] la = new long[SIZE];
    private String ident;

    public VeryBig(String id) {
        ident = id;
    }

    @Override
    public String toString() {
        return ident;
    }

    protected void finalize() {
        System.out.println("Finalizing " + ident);
    }
}

public class References {
    private static ReferenceQueue<VeryBig> rq = new ReferenceQueue<>();

    public static void checkQueue() {
        //poll()从首位置取元素并删除
        Reference<? extends VeryBig> inq = rq.poll();
        if (inq != null) {
            System.out.println("In queue: " + inq.get());
        }
    }


    public static void main(String[] args) {
        int size = 10;
        //或者从命令行参数中取
        if (args.length > 0) {
            size = new Integer(args[0]);
        }
        LinkedList<SoftReference<VeryBig>> sa = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            sa.add(new SoftReference<VeryBig>(new VeryBig("Soft " + i), rq));
            System.out.println("Just created: " + sa.getLast());
            checkQueue();
        }

        LinkedList<WeakReference<VeryBig>> wa = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            wa.add(new WeakReference<VeryBig>(new VeryBig("Weak " + i), rq));
            System.out.println("Just created: " + wa.getLast());
            checkQueue();
        }

        SoftReference<VeryBig> s = new SoftReference<>(new VeryBig("Soft"));
        WeakReference<VeryBig> w = new WeakReference<>(new VeryBig("Weak"));
        System.gc();

        LinkedList<PhantomReference<VeryBig>> pa = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            pa.add(new PhantomReference<>(new VeryBig("Phantom " + i), rq));
            System.out.println("Just created: " + pa.getLast());
            checkQueue();
        }




    }

}
