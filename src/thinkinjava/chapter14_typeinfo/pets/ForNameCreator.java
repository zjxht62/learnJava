//: typeinfo/pets/ForNameCreator.java
package thinkinjava.chapter14_typeinfo.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "thinkinjava.chapter14_typeinfo.pets.Mutt",
    "thinkinjava.chapter14_typeinfo.pets.Pug",
    "thinkinjava.chapter14_typeinfo.pets.EgyptianMau",
    "thinkinjava.chapter14_typeinfo.pets.Manx",
    "thinkinjava.chapter14_typeinfo.pets.Cymric",
    "thinkinjava.chapter14_typeinfo.pets.Rat",
    "thinkinjava.chapter14_typeinfo.pets.Mouse",
    "thinkinjava.chapter14_typeinfo.pets.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
