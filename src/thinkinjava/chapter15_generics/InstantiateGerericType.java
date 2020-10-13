package thinkinjava.chapter15_generics;

//创建类型T的实例，new T()无法实现，一部分原因是因为擦除，另一部分是因为编译器无法确定T是否具有默认（无参）构造器
//Java中的解决方式是传递一个工厂对象，并用他来创建新的实例

class ClassAsFactory<T> {
    T x;
    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Employee {}
public class InstantiateGerericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
        System.out.println("ClassAsFactory<Employee> succeeded");
        try {
            ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        } catch (Exception e) {
            System.out.println("ClassAsFactory<Integer> failed");
        }
    }
}
