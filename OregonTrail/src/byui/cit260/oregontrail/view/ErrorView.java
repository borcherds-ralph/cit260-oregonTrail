/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

/**
 *
 * @author Casey
 */
public class ErrorView {
    
    private static final PrintWriter error = error.log();
    
    public static void display(String className, String errorMessage) {
        
        error.println(
        "*********************************************************"
       +"\n There was an error" + errorMessage
       +"***********************************************************");
        
        //Log the Error
        logFile.println(className + ":" + errorMessage);
    }
}
