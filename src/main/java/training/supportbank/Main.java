package training.supportbank;
//import org.apache.logging.log4j.LogManager;
//import static org.apache.logging.log4j.LogManager.*;
//import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.*;

//import java.util.logging.Logger;
//import java.util.logging.LogManager;

public class Main {

    //private static final Logger LOGGER = LogManager.getLogger();
    public static void main(String args[]) throws IOException, ParseException {
        // Your code here!

      //  LOGGER.info("eroor report");
        Userinput usi = new Userinput();
        //LOGGER.debug("try this");
        //while loop for user inout request
        boolean running = true;
        while(running) {
          running = usi.requestUserInput();
        }
    }
    //Transaction one = new Transaction("john","mark",100,"narrative",29/12/2014);
    //System.out.println(one.amount)
}