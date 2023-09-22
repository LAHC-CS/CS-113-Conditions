import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;

public class TestExercise_3 {

   @Test
   public void testExercise_3()
   {
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      String[] args = {"4" , "6", "3"};
      // action
      Exercise_3.main(args);

      // assertion
      String expected = "The greatest: 6";
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