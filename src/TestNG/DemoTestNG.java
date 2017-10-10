package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
 

public class DemoTestNG {

       String message = "Hello World";
       MessageUtil messageUtil = new MessageUtil(message);
       @Test
       public void testPrintMessage() {	  
          Assert.assertEquals(message,messageUtil.printMessage());
       }
    }