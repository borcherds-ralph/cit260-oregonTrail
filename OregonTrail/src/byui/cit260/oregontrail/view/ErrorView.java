/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.io.PrintWriter;
import oregontrail.OregonTrail;

/**
 *
 * @author Casey
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = OregonTrail.getOutFile();
    private static final PrintWriter logFile = OregonTrail.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
        "*********************************************************"
       +"\n There was an error" + className + errorMessage
       +"***********************************************************");
        
        //Log the Error
        logFile.println(className + ":" + errorMessage);
    }
}
