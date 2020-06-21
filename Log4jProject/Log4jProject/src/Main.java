import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import org.apache.log4j.*;
/**
*
@author generator
*/
public class Main {

public static void main(String[] args) throws FileNotFoundException, IOException {
1:String nameFile = "log4j.properties";
2:PropertyConfigurator.configure(nameFile);
/*1*/Logger LOG = Logger.getRootLogger();
/*2*/Logger localLog2 = Logger.getLogger("logfile");
/*3*/Enumeration append = LOG.getAllAppenders();
/*3*/while (append.hasMoreElements()) {

/*3*/LOG.info("Available appender " + append.nextElement());
/*3*/}

LOG.info("Hi Logger info!");
localLog2.warn("logfile write!");
System.out.println("LOG.equals(localLog) is " + LOG.equals(localLog));
}
}