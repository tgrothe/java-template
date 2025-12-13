import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
  public static final Logger logger = LogManager.getLogger();

  public static void main(String[] args) {
    logger.info("Application started.");
    // Your application logic here
    logger.info("Application finished.");
  }
}
