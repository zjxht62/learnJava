package thinkinjava.chapter15_generics;//: generics/ExplicitTypeSpecification.java
import java.util.*;
import net.mindview.util.*;
import thinkinjava.chapter14_typeinfo.pets.Person;
import thinkinjava.chapter14_typeinfo.pets.Pet;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
