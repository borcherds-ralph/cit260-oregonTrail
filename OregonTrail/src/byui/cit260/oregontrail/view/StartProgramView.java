/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

//import byui.cit260.oregontrail.control.PersonControl;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.control.PersonControl;

/**
 *
 * @author ralphb
 */
public class StartProgramView extends View {

    public StartProgramView() {

        super("\n******************************************************"
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
            + "\n Please enter your name:                              "
        );
    }


    
    @Override
    public boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }

        Player player = PersonControl.createPlayer(playersName);

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

        mainMenuView.display();

    }

}
