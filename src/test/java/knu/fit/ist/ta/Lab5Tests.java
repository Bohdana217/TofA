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

/**
 *
 * @author admin
 */
public class Lab5Tests {
    
          @Test
                
        void test1(){
            
            String text = "game smart center music stadium read";
            
            assertEquals(Arrays.asList(2),SearchWord.linearSearch("center", text));
            assertEquals(Arrays.asList(0),SearchWord.linearSearch("game", text));
            assertEquals(Arrays.asList(),SearchWord.linearSearch("rolex", ""));

            
            assertEquals(Arrays.asList(2),SearchWord.linearSearch("center",1,text));
            assertEquals(Arrays.asList(0),SearchWord.linearSearch("game",0,text));
            assertEquals(Arrays.asList(3),SearchWord.linearSearch("music",-7,text));
        
            
            
        }
        
       
        
        
}
