import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

  @Test
  public void squad_instantiatesCorrectly_true() {
    Squad testSquad = new Squad("Feminists");
    assertEquals(true, testSquad instanceof Squad);
  }

  @Test
  public void getName_squadInstantiatesWithName_Feminists() {
    Squad testSquad = new Squad("Feminists");
    assertEquals("Feminists", testSquad.getName());
  }

  @Test
  public void all_returnsAllInstancesOfSquad_true() {
    Squad firstSquad = new Squad("Feminists");
    Squad secondSquad = new Squad("Superheros");
    assertEquals(true, Squad.all().contains(firstSquad));
    assertEquals(true, Squad.all().contains(secondSquad));
  }

  @Test
  public void clear_emptiesAllSquadsFromList_0() {
    Squad testSquad = new Squad("Feminists");
    Squad.clear();
    assertEquals(Squad.all().size(), 0);
  }

  @Test
  public void getId_squadsInstantiatesWithAnId_1() {
    Squad testSquad = new Squad("Feminists");
    assertEquals(1, testSquad.getId());
  }

  @Test
  public void find_returnsSquadWithSameId_secondSquad() {
    Squad.clear();
    Squad firstSquad = new Squad("Feminists");
    Squad secondSquad = new Squad("Superheros");
    assertEquals(Squad.find(secondSquad.getId()), secondSquad);
  }

  @Test
  public void getHeroes_initiallyReturnsEmptyList_ArrayList() {
    Squad.clear();
    Squad testSquad = new Squad("Feminists");
    assertEquals(0, testSquad.getHeroes().size());
  }

  @Test
  public void addHero_addsHeroToList_true() {
    Squad testSquad = new Squad("Feminists");
    Hero testHero = new Hero("Superman",20,"Fly","Kryptonite");
    testSquad.addHero(testHero);
    assertTrue(testSquad.getHeroes().contains(testHero));
  }
}
