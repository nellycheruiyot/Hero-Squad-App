import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero testHero = new Hero("Superman",20,"Fly","Kryptonite");
    assertEquals(true, testHero instanceof Hero);
  }

  // @Test
  // public void Hero_instantiatesWithName_String() {
  //   Hero testHero = new Hero("Superman",20,"Fly","Kryptonite");
  //   assertEquals("Superman",20,"Fly","Kryptonite", testHero.getName(),testHero.getAge(), testHero.getPower(),testHero.getWeakness());
  // }
  //
  // @Test
  // public void Hero_instantiatesWithAge_20() {
  //   Hero testHero = new Hero(20);
  //   assertEquals(20, testHero.getAge());
  // }
  //
  // @Test
  // public void Hero_instantiatesWithPower_String() {
  //   Hero testHero = new Hero("Fly");
  //   assertEquals("Fly", testHero.getPower());
  // }
  //
  // @Test
  // public void Hero_instantiatesWithWeakness_String() {
  //   Hero testHero = new Hero("Kryptonite");
  //   assertEquals("Kryptonite", testHero.getWeakness());
  // }

}
