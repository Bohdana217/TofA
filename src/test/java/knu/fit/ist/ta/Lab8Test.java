/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;
import knu.fit.ist.ta.lab8.Task;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 *
 * @author admin
 */
public class Lab8Test {
    
     Task find = new Task();
    
    
    int[] first = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    int[] second = {0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4};
    @Test 
        void testforlab8Check(){
            assertEquals(String.valueOf(find.linearSearch(first, 4)), "4");
            assertEquals(String.valueOf(find.linearSearch(first, 7)), "7");
            assertEquals(String.valueOf(find.linearSearch(first, 0)), "0");
           
            
            assertEquals(String.valueOf(find.binarySearch(first, 4)), "4");
            assertEquals(String.valueOf(find.binarySearch(first, 7)), "7");
            assertEquals(String.valueOf(find.binarySearch(first, 0)), "0");
         
            
            assertEquals(String.valueOf(find.jumpSearch(first, 4)), "4");
            assertEquals(String.valueOf(find.jumpSearch(first, 7)), "7");
            assertEquals(String.valueOf(find.jumpSearch(first, 0)), "0");
           
        }
         
        @Test 
        void test2forlab8Check() {  
            assertEquals(String.valueOf(find.linearSearch(second, 2)), "2");
            assertEquals(String.valueOf(find.binarySearch(second, 2)), "7");
           
            
        }          
}
