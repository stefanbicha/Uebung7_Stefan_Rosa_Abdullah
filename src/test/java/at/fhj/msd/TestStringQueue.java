package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * tests the StringQueue class
 * @author Abdullah Kaitoua
 */

public class TestStringQueue {
    private StringQueue stringQueue;

    /**
     * creates a new object of stringQueue  (maxSize = 2) before each test case
     * */
    @BeforeEach
    public void setUp(){
        stringQueue = new StringQueue(2);
    }


    /**
     * returns true if a String was given as parameter to add
     */
    @Test
    public void testOfferA(){
        String test = "test A";
        stringQueue.offer(test);
        Assertions.assertTrue(stringQueue.offer(test));
    }

    /**
     * if it returns false if the list is full because added 1 more String
     */
    @Test
    public void testOfferB(){
        String test = "test B";
        String test2 = "test C";
        stringQueue.offer(test);
        stringQueue.offer(test2);
        Assertions.assertFalse(stringQueue.offer(test));
    }


    /**
     * checks poll methods when it is not empty by comparing the result after adding and then calling the method poll
     * it polls the first added element then the assertion works
     */
    @Test
    public void testPollA(){
        String test  = "test";
        String test2 = "test2";
        stringQueue.offer(test);
        stringQueue.offer(test2);
        Assertions.assertEquals(test,stringQueue.poll());
    }

    /**
     *  it returns null if  is empty.
     */
    @Test
    public void testPollB(){
        Assertions.assertNull(stringQueue.poll());
    }

    /**
     * if remove from an empty list an exception is thrown
     */
    @Test
    public void testRemoveA(){
        assertThrows(NoSuchElementException.class, () -> stringQueue.remove());
    }


    /**
     *  if it removes the first added element by comparing assertions
     */
    @Test
    public void testRemoveB(){
        String test  = "test";
        String test2 = "test2";
        stringQueue.offer(test);
        stringQueue.offer(test2);
        Assertions.assertEquals(test,stringQueue.remove());
    }



    /**
     *  if it gets the first element
     */
    @Test
    public void testPeekA(){
        String test = "test";
        String test2 = "test2";
        stringQueue.offer(test);
        stringQueue.offer(test2);
        Assertions.assertEquals(test,stringQueue.peek());
    }

    /**
     *  returns null if the list empty
     */
    @Test
    public void testPeekB(){
        Assertions.assertNull(stringQueue.peek());
    }





    /**
     * checks if it peeks the first added element
     */
    @Test
    public void testElementA(){
        String test = "test";
        String test2 = "test2";
        stringQueue.offer(test);
        stringQueue.offer(test2);
        Assertions.assertEquals(test,stringQueue.element());
    }

    /**
     * if the list is empty , throws an exception
     */
    @Test
    public void testElementB(){
        assertThrows(NoSuchElementException.class, () -> stringQueue.element());
    }

}