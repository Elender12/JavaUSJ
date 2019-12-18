/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.futurepath.controller;

import dev.futurepath.calculator.core.ICalculator;
import dev.futurepath.calculator.core.IOManager;

/**
 *
 * @author Elena Cirstea
 */
public class CalculatorController implements ICalculator {
    private IOManager manager;

    public CalculatorController(IOManager manager) {
        this.manager = manager;
    }
    
    public void sum(){
        manager.setResult(
                sum(manager.getFirstValue(), manager.getSecondValue())
        );
        
    }
    //un void para el boton
    //controller.sum()
    
    
    @Override
    public double sum(double d, double d1) {
        return d1+d;
    }

    @Override
    public double multiply(double d, double d1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double subtract(double d, double d1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double divide(double d, double d1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double sqrt(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double pow(double d, double d1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
