import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReversed_1() {
      int[] input = {1, 2, 3, 4, 5};
      assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input));
  }

  @Test
  public void testReversed_2() {
      int[] input = {};
      assertArrayEquals(new int[]{}, ArrayExamples.reversed(input));
  }
} 
