import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;

public class TestExercise_1 {

   @Test
   public void testExercise_1()
   {
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      String[] args = {"47"};
      // action
      Exercise_1.main(args);

      // assertion
      String expected = "47.0 is positive";
      try {
        assertEquals(expected, bos.toString().trim());
      } catch(AssertionError e) {
        System.setOut(originalOut);
        
        System.out.println("Got: \""+bos.toString().trim()+"\" Expected: \""+expected.trim()+"\"");
        throw e;
      }

      // undo the binding in System
      System.setOut(originalOut);
   }
}