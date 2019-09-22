package headfirst.chapter5;

import headfirst.chapter2.GameLauncher;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/8/13
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
//        SimpleDotCom dot = new SimpleDotCom();
//        int[] locations = {2, 3, 4};
//        dot.setLocationCells(locations);
//        String userGuess = "2";
//        dot.checkYourSelf(userGuess);

        int numOfguess = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int)(Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourSelf(guess);
            numOfguess++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfguess + " guesses");
            }
        }
    }
}
