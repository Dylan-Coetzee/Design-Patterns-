/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BuilderPattern;

/**
 *
 * @author Kurvin Hendricks
 */
public interface PersonBuilder {
    public void buildName();
    public void buildSurname();
    public Person getPerson();
}
