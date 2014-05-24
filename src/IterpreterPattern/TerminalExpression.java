/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IterpreterPattern;

/**
 *
 * @author Kurvin Hendricks
 */
public class TerminalExpression implements Expression{
    private String data;
    
    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpreter(String context) {
        if(context.contains(data)){
            return true;
        }else return false;
    }
}