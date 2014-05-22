/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PrototypePattern;

/**
 *
 * @author Kurvin Hendricks
 */
public class Human implements Prototype{
    String name; 
    String Lname;

    public Human(String name, String Lname) {
        this.name = name;
        this.Lname = Lname;
    }
    
    @Override
    public Prototype doClone() {
        return new Human(name, Lname);
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", Lname=" + Lname + '}';
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return Lname;
    }
    
    
}
