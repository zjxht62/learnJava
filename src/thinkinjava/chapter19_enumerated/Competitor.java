//: enumerated/Competitor.java
// Switching one enum on another.
package thinkinjava.chapter19_enumerated;

public interface Competitor<T extends Competitor<T>> {
  Outcome compete(T competitor);
} ///:~
