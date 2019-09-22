package headfirst.chapter6;

import java.util.ArrayList;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/19
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> loc) {
        this.locationCells = loc;
    }

    public String checkYourSelf(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
