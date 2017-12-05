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
public class OutputRecommendedSupplies extends Exception {

     public OutputRecommendedSupplies() {
     }

     public OutputRecommendedSupplies(String message) {
          super(message);
     }

     public OutputRecommendedSupplies(String message, Throwable cause) {
          super(message, cause);
     }

     public OutputRecommendedSupplies(Throwable cause) {
          super(cause);
     }

     public OutputRecommendedSupplies(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
          super(message, cause, enableSuppression, writableStackTrace);
     }
     
}
