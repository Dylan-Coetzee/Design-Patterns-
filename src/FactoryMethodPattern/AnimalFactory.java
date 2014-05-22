/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryMethodPattern;

/**
 *
 * @author Kurvin Hendricks
 */
public class AnimalFactory {
    public Animal getAnimal(String type){
        if("mary".equals(type)){
            return new Sheep();
        }else return new Cow();
    }
}
