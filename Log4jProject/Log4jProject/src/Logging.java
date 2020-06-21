import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Logging {
	static Logger logger = Logger.getLogger(Logging.class);
	
	public static void main(String[] args) {	          
	        logger.debug("This is debug message");
	        logger.info("This is info message");
	        logger.warn("This is warn message");
	        logger.fatal("This is fatal message");
	        logger.error("This is error message");
	        System.out.println("Logic executed successfully....");
	        
		try {
			throw new ArithmeticException("Try Me ArithmeticException !");
			} catch (ArithmeticException ex) {
			Logger.getLogger(Exception.class.getName()).log(Level.ERROR, "Catch ArithmeticException !!!", ex);
			}
			
	}

}
