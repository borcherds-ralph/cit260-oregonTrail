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
public class HuntControlException extends Exception {

     public HuntControlException() {
     }

     public HuntControlException(String message) {
          super(message);
     }

     public HuntControlException(String message, Throwable cause) {
          super(message, cause);
     }

     public HuntControlException(Throwable cause) {
          super(cause);
     }

     public HuntControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
          super(message, cause, enableSuppression, writableStackTrace);
     }
     
}
