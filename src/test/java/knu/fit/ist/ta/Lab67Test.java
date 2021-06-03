/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import java.util.Arrays;
import java.util.List;
import knu.fit.ist.ta.lab6.Recursion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author admin
 */
public class Lab67Test {

    @Test
    void RecursionTest1() {
        Recursion recur = new Recursion(9);
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        recur.setArray(arr);

        assertEquals(recur.lessThanX(3), 2);
        assertEquals(recur.lessThanX(4), 3);

        assertEquals(recur.lessThanXTail(3), 2);
        assertEquals(recur.lessThanXTail(4), 3);
    }

    
}
