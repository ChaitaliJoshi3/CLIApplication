
package dev.chaitaliJ.CLIApplication.utility;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerWrapper {

    private static final Logger logger = Logger.getLogger(LoggerWrapper.class.getName());

    public void logInfo(String message) {
        logger.log(Level.INFO, message);
    }

    public void logWarning(String message) {
        logger.log(Level.WARNING, message);
    }

    public void logError(String message, Throwable throwable) {
        logger.log(Level.SEVERE, message, throwable);
    }
}
