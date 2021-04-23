/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

/**
 *
 * @author admin
 */

public class Calculate {
    
    public static float lab2equation(float x){
        
        Float num = 6*x;
        float a = 7f, b = 7f, c = -8f, d = 6f;
        
        if(num< 0){return Float.MAX_VALUE;}
        return (float) Math.log(d*x)/(a*x*x+b*x+c); 
    }
  
}
