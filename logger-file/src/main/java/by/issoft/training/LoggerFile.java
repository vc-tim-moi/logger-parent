package by.issoft.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerFile 
{
    private static final Logger logger 
	      = LoggerFactory.getLogger(LoggerFile.class);
    public static void main( String[] args )
    {
        logger.info("Example log from {}", LoggerFile.class.getSimpleName());
    }
}
