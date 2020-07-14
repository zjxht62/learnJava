package thinkinjava.chapter8_polymorphism.shape;

public class Shapes {
    private static RandomShapeGenrator genrator = new RandomShapeGenrator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = genrator.next();
        }
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
