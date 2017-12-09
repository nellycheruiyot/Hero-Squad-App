import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

  @Test
  public void squad_instantiatesCorrectly_true() {
    Squad testSquad = new Squad("Feminists");
    assertEquals(true, testSquad instanceof Squad);
  }
}
