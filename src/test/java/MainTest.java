import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
  @Test
  void add() {
    assertEquals(0, Main.add(-2, 2));
    assertEquals(0, Main.add(2, -2));
  }
}
