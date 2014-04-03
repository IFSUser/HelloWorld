/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mmm.lms;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;

/**
 *
 * @author A4M84ZZ
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HelloWorld");
        
        Calc a=new Calc(1,1);
        System.out.println("sum is : "+a.getSum());
    }
    
}
