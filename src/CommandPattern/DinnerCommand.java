/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CommandPattern;

/**
 *
 * @author Dylan
 */
public class DinnerCommand implements Command{
    Dinner dinner;
    
    public DinnerCommand(Dinner dinner){
        this.dinner = dinner;
    }

    @Override
    public void execute() {
       dinner.makeDinner();
    }
}
