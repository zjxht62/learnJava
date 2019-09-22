package headfirst.chapter5;

import com.sun.javafx.scene.text.HitInfo;

import javax.tools.Diagnostic;
import java.io.FileReader;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/13
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        this.locationCells = locs;
    }

    public String checkYourSelf(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
