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
public class Context {
    int tempreatureInF;
    Strategy strategy;

    public Context(int tempreatureInF, Strategy strategy) {
        this.tempreatureInF = tempreatureInF;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    
    public int getTempreatureInF(){
        return tempreatureInF;
    }
    
    public boolean getResult(){
        return strategy.checkTempreature(tempreatureInF);
    }
}
