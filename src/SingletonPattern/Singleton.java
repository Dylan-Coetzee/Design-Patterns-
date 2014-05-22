/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SingletonPattern;

import java.util.Date;

/**
 *
 * @author Kurvin Hendricks
 */
public class Singleton {
    private static Singleton NEO;
    private Date d = new Date();
    
    private Singleton(){};
    
    public synchronized static Singleton instance(){
        if(NEO == null){
            NEO = new Singleton();
        }
        return NEO;
    }
    
    public Date getDate(){
        return d;
    }
}
