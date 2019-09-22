package headfirst.chapter6;


import org.omg.CORBA.ARG_OUT;

import javax.swing.*;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/19
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfGuess = 0;
    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two =  new DotCom();
        two.setName("Pornhub.com");
        DotCom three =  new DotCom();
        three.setName("baidu.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, Pornhub.com, baidu.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newlocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newlocation);
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuess++;
        String result = "miss";
        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourSelf(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuess <= 18) {
            System.out.println("It only takes you " + numOfGuess + "guesses");
            System.out.println("you got out before your options sank");
        } else {
            System.out.println("Took you too long enough" + numOfGuess + "guesses");
            System.out.println("fish are dancing with your options");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }


}
