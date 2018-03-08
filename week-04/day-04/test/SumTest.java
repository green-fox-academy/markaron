import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
  List<Integer> list;
  Sum input;

  @Before
  public void setUp() {
    list = new ArrayList<>(Arrays.asList(1,1,1,2));
    input = new Sum();
  }

  @Test
  public void sumOfYourList() {
    assertEquals(5,input.sumOfYourList(list));
  }
}