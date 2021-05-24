/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import knu.fit.ist.ta.lab4.TextProcess;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author admin
 */
public class Lab4Tests {

    @Test

    void GetClearedText() {
        TextProcess text = new TextProcess("The Internet of Things, or IoT    ");
        assertEquals(text.GetClearedText(), "the internet of things or iot");
    }

    @Test
    void testGetUniqueWordsCount() {
        TextProcess text = new TextProcess("the internet of things!");
        assertEquals(text.GetUniqueWordsNumber(), 4);
    }

    @Test
    void testGetWordsNumber() {
        TextProcess processor = new TextProcess("the internet of things or iot refers to the billions of physical devices around the world");
        assertEquals(processor.GetWordsNumber(), 16);
    }

}
