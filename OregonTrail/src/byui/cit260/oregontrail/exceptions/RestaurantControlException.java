/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.exceptions;

/**
 *
 * @author Br33h3rr3ra
 */
public class RestaurantControlException extends Exception {

    public RestaurantControlException() {
    }

    public RestaurantControlException(String string) {
        super(string);
    }

    public RestaurantControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public RestaurantControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public RestaurantControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
    
