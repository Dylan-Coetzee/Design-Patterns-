/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StrategyPattern;

/**
 *
 * @author Dylan
 */
public class HikeStrategy implements Strategy{

    @Override
    public boolean checkTempreature(int tempreatureInF) {
        if((tempreatureInF >= 50)&&(tempreatureInF <= 90)){
            return true;
        }else return false;
    }
    
}
