package thinkinjava.chapter11_holding.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/8/4
 */
public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    void hop() {
        System.out.println("Number:" + gerbilNumber + "is hopping");
    }


    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilList = new ArrayList<>();
        gerbilList.add(new Gerbil(1));
        gerbilList.add(new Gerbil(2));
        gerbilList.add(new Gerbil(3));
        gerbilList.add(new Gerbil(4));
        for (Gerbil g : gerbilList) {
            g.hop();
        }

        for (int i = 0; i < gerbilList.size(); i++) {
            gerbilList.get(i).hop();
        }

    }
}
