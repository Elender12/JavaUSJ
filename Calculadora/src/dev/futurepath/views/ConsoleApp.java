
package dev.futurepath.views;
import dev.futurepath.calculator.core.IOManager;
import dev.futurepath.calculator.core.Operation;
import dev.futurepath.controller.CalculatorController;
import java.util.Scanner;

/**
 *
 * @author Elena Cirstea
 */
public class ConsoleApp implements IOManager {
    Scanner teclado = new Scanner(System.in);

    CalculatorController controlador;// = new CalculatorController(this);
    
        //  controlador.sum();

    public ConsoleApp() {
        controlador = new CalculatorController(this);
           
    }
    public static void main(String[] args) {
        ConsoleApp c = new ConsoleApp();
        c.controlador.sum();
        
    }
    

    @Override
    public void setResult(double d) {
        System.out.print("Result: " + d);
     }

    @Override
    public double getResult() {
        return 0;
    }

    @Override
    public double getFirstValue() {
        double num1= teclado.nextDouble();
        return num1;
     }

    @Override
    public double getSecondValue() {
        double num2= teclado.nextDouble();
        return num2;
      }

    @Override
    public void getFirstValue(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getSecondValue(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Operation getOperation() {
        return null;
     
    }

    @Override
    public void setOperation(Operation oprtn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
