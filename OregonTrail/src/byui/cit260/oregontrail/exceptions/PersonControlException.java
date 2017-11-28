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
public class PersonControlException extends Exception {

     public PersonControlException() {
     }

     public PersonControlException(String message) {
          super(message);
     }

     public PersonControlException(String message, Throwable cause) {
          super(message, cause);
     }

     public PersonControlException(Throwable cause) {
          super(cause);
     }

     public PersonControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
          super(message, cause, enableSuppression, writableStackTrace);
     }
     
}
