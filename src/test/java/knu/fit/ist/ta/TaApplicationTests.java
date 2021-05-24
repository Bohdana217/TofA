package knu.fit.ist.ta;

import knu.fit.ist.ta.lab4.TextProcess;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    void testlab4() {

        TextProcess text = new TextProcess("The Internet of Things, or IoT    ");
        assertEquals(text.GetClearedText(), "the internet of things or iot");
    }

    void testGetUniqueWordsCount() {
        TextProcess text = new TextProcess("the internet of things!");
        assertEquals(text.GetUniqueWordsNumber(), 4);
    }

    void testGetWordsNumber() {
        TextProcess processor = new TextProcess("the internet of things or iot refers to the billions of physical devices around the world");
        assertEquals(processor.GetWordsNumber(), 16);
    }
}
