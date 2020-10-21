package by.issoft.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerConsole 
{
    private static final Logger logger 
	      = LoggerFactory.getLogger(LoggerConsole.class);
    public static void main( String[] args )
    {
        logger.info("Example log from {}", LoggerConsole.class.getSimpleName());
    }
}
