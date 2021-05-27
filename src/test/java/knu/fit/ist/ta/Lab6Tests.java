/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import java.util.Arrays;
import java.util.List;
import knu.fit.ist.ta.lab7.Recursion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author admin
 */



public class Lab6Tests {
    
    @Test
    void RecursionTest1() {
        Recursion rec = new Recursion(9);
        List<Integer> arr = Arrays.asList(1, 2, 3, 4 ,5);
        rec.setArray(arr);

        assertEquals(rec.lessThanX( 3), 2);
        assertEquals(rec.lessThanX( 4), 3);

        assertEquals(rec.lessThanXTail( 3), 2);
        assertEquals(rec.lessThanXTail( 4), 3);
    }


    
    
    
}
