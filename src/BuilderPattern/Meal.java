package BuilderPattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dylan
 */
public class Meal {
    private String drink;
    private String mainCourse;

    public String getDrink() {
        return drink;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    } 

    @Override
    public String toString() {
        return "Meal{" + "drink=" + drink + ", mainCourse =" + mainCourse + '}';
    }
    
}
