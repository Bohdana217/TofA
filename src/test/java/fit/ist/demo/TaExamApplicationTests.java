package fit.ist.demo;

import fit.ist.demo.Exam.Calculation;
import fit.ist.demo.Exam.Task;
import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaExamApplicationTests {

	@Test
	void contextLoads() {
	}

        @Test
    void testFormula() {
        
        assertEquals(0.1538461595773697, Calculation.Calc(2f));
        assertEquals(2, Calculation.Calc(0f));
        assertEquals(0.031786397099494934, Calculation.Calc(10.32f));
        assertEquals(-0.23255813121795654, Calculation.Calc(-1.6f));
    }
    
    @Test
    void testSearching()
    {
        Task fr = new Task();
        float[] args = new float[]{2f, 3f, 8f};
        fr.SetArgs(args);
        fr.Calc();
        assertEquals(2, Task.Search((float)  0.10526316));
    }
    
    
    
}
