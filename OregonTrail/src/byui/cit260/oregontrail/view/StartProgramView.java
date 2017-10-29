/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

//import byui.cit260.oregontrail.control.PersonControl;
import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.view.MainMenuView;
import java.util.Scanner;

/**
 *
 * @author ralphb
 */
public class StartProgramView {

    // Banner Darrin
    private final String promptMessage;

    public StartProgramView() {

        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n******************************************************"
                + "\n                                                      "
                + "\n This is a text based game based on Oregon Trail.    "
                + "\n In this game you will help the pioneers reach     "
                + "\n Oregon before the first snowfall.  You and your"
                + "\n family will need to strategize and decide how much   "
                + "\n food and supplies are needed for the journey at hand."
                + "\n Hunting supplies would be very helpful in assisting  "
                + "\n with food needs.  There are many stops and           "
                + "\n unnexpected events along the way.  You will need to  "
                + "\n buy animals/oxen and a wagon.          "
                + "\n                                                      "
                + "\n Good luck.                        "
                + "\n                                                      "
                + "\n******************************************************"
        );

    }

    public void displayStartProgramView() {

        boolean done = false;
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(playersName);

        } while (!done);
    }

    private String getPlayersName() {

        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }

            break;
        }

        return value;
    }

    private boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }

        Player player = GameControl.createPlayer(playersName);

        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }

        this.displayNextView(player);

        return true;
    }

    private void displayNextView(Player player) {
        
        String userName = player.getName();
        System.out.println("\n======================================="
                + "\n Welcome to the game " + userName
                + "\n Enjoy the game! We wish you the best"
                + "\n"
                + "\n========================================"
        );

        MainMenuView mainMenuView = new MainMenuView();

        mainMenuView.displayMainMenuView();

    }

}
