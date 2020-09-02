package thinkinjava.chapter11_holding;

import thinkinjava.typeinfo.pets.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/8/16
 */
public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople = new HashMap<>();
    static {
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Tom"), new Dog("Wang")));
    }
    public static void main(String[] args) {
        System.out.println("People:" + petPeople.keySet());
        System.out.println("Pets:" + petPeople.values());
        for (Person person : petPeople.keySet()) {
            System.out.println(person + "has: ");
            for (Pet pet : petPeople.get(person)) {
                System.out.println("   " + pet);
            }
        }
    }
}
