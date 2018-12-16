package FirstTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class MessageUtilTest {
    int num = 5;
    String temp = null;
    String message = "Hello";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void printMessage() {
        assertEquals(message, messageUtil.printMessage());
    }
    @Test
    public void testAdd() {
        //test data
        int num = 5;
        String temp = null;
        String str = "Junit is working fine";

        //check for equality
        assertEquals("Junit is working fine", str);

        //check for false condition
        assertFalse(num > 6);

        //check for not null value
        assertNull(temp);
    }


}