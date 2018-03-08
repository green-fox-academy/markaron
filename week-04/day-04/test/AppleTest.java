import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppleTest {

  Apple input = new Apple();

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void getApple() {
    assertEquals("apple",input.getApple());
  }
}