/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.lab2;

import knu.fit.ist.ta.lab2.Calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author admin
 */
@SpringBootTest

 public class Lab2tests {

    @Autowired
    Calculate calculate;
    
    
    @Test
    void test1() {
        
        assertEquals(-1.6, calculate.equals(Float.MAX_VALUE));
        assertEquals(0.6, calculate.equals(Float.MAX_VALUE));
        
        assertEquals(0.5, calculate.equals(-0.4f));
     
    }
}
