/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterpreterPattern;

/**
 *
 * @author Dylan
 * http://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm
 */
public class AndExpression implements Expression{
    private Expression expr1;
    private Expression expr2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expr1 = expression1;
        this.expr2 = expression2;
    }
    
    @Override
    public boolean interpreter(String context) {
        return expr1.interpreter(context) && expr2.interpreter(context);
    }
}
