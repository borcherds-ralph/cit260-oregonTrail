/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.exceptions.HuntControlException;

/**
 *
 * @author ralphb
 */
public class HuntControl {
    public double calcFoodWeight(long baseWeight1, long baseWeight2, int guide) throws HuntControlException  {
        // validate inputs
        if (baseWeight1 <= 0) {
            throw new HuntControlException("\n You cannot have a weight less than or equal to  0");
        }
        if (baseWeight2 < 0) {
           throw new HuntControlException("\n You cannot have a weight less than or equal to  0");
        }
        if (guide != 0 && guide != 1) {
           throw new HuntControlException("\n You must have either a guided or unguided hunt.");
        }
        

     // calculations
        long yield = baseWeight1 + baseWeight2;
        long weight;
 
        if (guide == 0) {
            weight = yield - 100;
            if (weight > 0) {
                yield = 100;
            }
        }
        if (guide == 1) {
            weight = yield - 200;
            if (weight > 0) {
                yield = 200;
            }
        }
        
return yield;
    }
}
