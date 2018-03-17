import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ExtensionTest {
  Extension extension = new Extension();

  @Test
  public void testAdd_2and3is5() {
    assertEquals(6, extension.add(3, 3));
  }

  @Test
  public void testAdd_1and4is5() {
    assertEquals(14, extension.add(10, 4));
  }

  @Test
  public void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  public void testMaxOfThree_second(){
    assertEquals(10,extension.maxOfThree(5,10,6));
  }

  @Test
  public void testMaxOfThree_equals(){
    assertEquals(6,extension.maxOfThree(6,6,3));
  }

  @Test
  public void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  public void testMedian_four() {
    assertEquals(5,5, extension.median(Arrays.asList(7,5,3,5)));
  }

  @Test
  public void testMedian_five() {
    assertEquals(3,3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  public void testMedian_four_notDoubles (){
    assertEquals(2.5,2.5, extension.median(Arrays.asList(1,2,3,4)));
  }

  @Test
  public void testMedian_four_long (){
    assertEquals(9.5,9.5, extension.median(Arrays.asList(100,20,3,4,21,6,7,111,9,10,11,12,5,1,15,0)));
  }

  @Test
  public void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  public void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  public void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  public void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

}