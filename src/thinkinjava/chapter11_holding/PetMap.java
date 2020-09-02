package thinkinjava.chapter11_holding;

import thinkinjava.typeinfo.pets.Cat;
import thinkinjava.typeinfo.pets.Dog;
import thinkinjava.typeinfo.pets.Hamster;
import thinkinjava.typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/8/16
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog = petMap.get("My Dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue(dog));


    }
}
