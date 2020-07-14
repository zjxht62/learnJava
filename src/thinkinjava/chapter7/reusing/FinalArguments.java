package thinkinjava.chapter7.reusing;

class Gizmo {
    public void spin() {}
}
public class FinalArguments {
    //通过final 可以使传进来的对象不能改变其引用
    void with(final Gizmo gizmo) {
//        gizmo = new Gizmo();
    }
    void without(Gizmo gizmo) {
        gizmo = new Gizmo();
        gizmo.spin();
    }
}
