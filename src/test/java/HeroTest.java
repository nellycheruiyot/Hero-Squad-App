import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero testHero = new Hero("Superman");
    assertEquals(true, testHero instanceof Hero);
  }

  @Test
  public void Hero_instantiatesWithDescription_String() {
    Hero testHero = new Hero("Superman");
    assertEquals("Superman", testHero.getDescription());
  }

}
