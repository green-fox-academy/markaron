import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  Fibonacci fibonacci = new Fibonacci();

  @Test
  public void getFibonacciMemberByIndex() {
    assertEquals((Integer) 21,fibonacci.getFibonacciMemberByIndex(9));
  }

  @Test
  public void getFibonacciMembersByIndex_0(){
    assertEquals((Integer) 0, fibonacci.getFibonacciMemberByIndex(1));
  }
}