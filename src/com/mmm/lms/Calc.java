/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mmm.lms;

/**
 *
 * @author A4M84ZZ
 */
public class Calc {
    
    private int a;
    private int b;
    
    public Calc(int a, int b){
        this.a=a;
        this.b=b;
    }
    
    public int getSum(){
        return a+b;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }
    
}
