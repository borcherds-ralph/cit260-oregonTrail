/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.exceptions;

/**
 *
 * @author ralphb
 */
public class GamePlayMenuException extends Exception {

     public GamePlayMenuException() {
     }

     public GamePlayMenuException(String message) {
          super(message);
     }

     public GamePlayMenuException(String message, Throwable cause) {
          super(message, cause);
     }

     public GamePlayMenuException(Throwable cause) {
          super(cause);
     }

     public GamePlayMenuException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
          super(message, cause, enableSuppression, writableStackTrace);
     }
     
}
