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
public class GroupControlException extends Exception {

     public GroupControlException() {
     }

     public GroupControlException(String message) {
          super(message);
     }

     public GroupControlException(String message, Throwable cause) {
          super(message, cause);
     }

     public GroupControlException(Throwable cause) {
          super(cause);
     }

     public GroupControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
          super(message, cause, enableSuppression, writableStackTrace);
     }
     
}
