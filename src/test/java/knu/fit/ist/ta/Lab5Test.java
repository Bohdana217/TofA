/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import java.util.Arrays;
import knu.fit.ist.ta.lab5.SearchWord;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author admin
 */
@SpringBootTest
public class Lab5Test {
    
     @Test
                
        void test1(){
            
            String text = "the internet of things essentially enables us ";
            
            assertEquals(Arrays.asList(2),SearchWord.linearSearch("of", text));
            assertEquals(Arrays.asList(0),SearchWord.linearSearch("the", text));
            assertEquals(Arrays.asList(3),SearchWord.linearSearch("things", text));
            assertEquals(Arrays.asList(5),SearchWord.linearSearch("enables", text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("rolex", ""));

            
            
            
        }
        
}
