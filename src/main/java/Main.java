import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
  public static final Logger logger = LogManager.getRootLogger();

  public static void main(String[] args) {
    Runtime.getRuntime()
        .addShutdownHook(new Thread(() -> logger.debug("Application is shutting down")));
    logger.debug("Application started");
  }
}
