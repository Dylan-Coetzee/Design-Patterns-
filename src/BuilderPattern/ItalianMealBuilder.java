/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BuilderPattern;

/**
 *
 * @author Dylan
 */
public class ItalianMealBuilder implements MealBuilder{
    
    private Meal m;
        
    public ItalianMealBuilder(){
        m = new Meal();
    }
    
    @Override
    public void buildDrink() {
        m.setDrink("Coke");
    }

    @Override
    public void buildMainCourse() {
        m.setMainCourse("Sea Food");
    }

    @Override
    public Meal getMeal() {
        return m;
    }
    
}
