/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PrototypePattern;

/**
 *
 * @author Dylan
 */
public class Animal implements Prototype{
    String name;
    String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    @Override
    public Prototype doClone() {
        return new Animal(name, type);
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", type=" + type + '}';
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    
    
    
}
