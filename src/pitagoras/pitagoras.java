/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitagoras;

/**
 *
 * @author 312A-32
 */
public class pitagoras {
    private double a;
    private double c;
    public pitagoras(double c,double a) {
        this.a=a;
        this.c=c;
        
    }
    
 
    
    static public double calcular_hipotenusa_b(double a, double c){
        
        return Math.sqrt(Math.pow(c, 2)+ Math.pow(a, 2));
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }


    
    
}
