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
public class OregontTrailException  extends Exception {

    public OregontTrailException() {
    }

    public OregontTrailException(String message) {
        super(message);
    }

    public OregontTrailException(Throwable cause) {
        super(cause);
    }

    public OregontTrailException(String message, Throwable cause) {
        super(message, cause);
    } 
}
 