import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
  public static final Logger logger = LogManager.getLogger();

  public static void main(String[] args) {
    logger.debug("Hello");
    logger.debug(add(2, 3));
  }

  public static int add(int a, int b) {
    return a + b;
  }
}
