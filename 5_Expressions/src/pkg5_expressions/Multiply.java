/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_expressions;

import java.util.Map;

/**
 *
 * @author Borislav Sabev s4726863, Austin Atchley s1016930
 */
public class Multiply extends DoubleArgsExpression{

    public Multiply(Expression arg1, Expression arg2) {
        super(arg1, arg2);
    }

    @Override
    public double eval(Map<String, Double> store) {
        return super.getArg1().eval(store) * super.getArg2().eval(store);
    }

    @Override
    public Expression optimize() {
        // if both are const return their product
        if(super.getArg1().isConstant() && super.getArg2().isConstant())
            return new Constant(super.getArg1().eval(null) 
                              * super.getArg2().eval(null));
        
        // if only arg1 is constant
        if(super.getArg1().isConstant()){
            if(super.getArg1().eval(null) == 0) // equal to 0, return 0
                return new Constant(0.0);
            if(super.getArg1().eval(null) == 1) // equal to 1, return arg2
                return super.getArg2();
        }
        
        // if only arg2 is constant 
        if(super.getArg2().isConstant()){
            if(super.getArg2().eval(null) == 0) // equal to 0, return 0
                return new Constant(0.0);
            if(super.getArg2().eval(null) == 1) // equal to 1, return arg1
                return super.getArg1();
        }
        // if there is no way to reduce it, return the expression itself
        return this;
    }
    
    @Override
    public String toString() {
        return String.format("(%s * %s)", super.getArg1().toString(), super.getArg2().toString());
    }
    
}
