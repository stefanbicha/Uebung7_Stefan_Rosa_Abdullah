package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * tests the DoubleQueue class
 * @author Rosa Dennig
 */

public class TestDoubleQueue {
    private DoubleQueue doubleQueue;

    /**
     * creates a new object of doubleQueue  (maxSize = 2) before each test case
     * */
    @BeforeEach
    public void setUp(){
        doubleQueue = new DoubleQueue(2);
    }


    /**
     * it returns true if a Double was given as parameter to add
     */
    @Test
    public void testOfferA(){
        double test = 1.7;
        doubleQueue.offer(test);
        Assertions.assertTrue(doubleQueue.offer(test));
    }

    /**
     * it returns false if the list is full because one more Double is added
     */
    @Test
    public void testOfferB(){
        double test = 30.2;
        double test2 = 0.2;
        doubleQueue.offer(test);
        doubleQueue.offer(test2);
        Assertions.assertFalse(doubleQueue.offer(test));
    }


    /**
     * checks poll methods when it is not empty by comparing the result after adding and then calling the method poll
     * it polls the first added element then the assertion works
     */
    @Test
    public void testPollA(){
        double test = 30.2;
        double test2 = 0.2;
        doubleQueue.offer(test);
        doubleQueue.offer(test2);
        Assertions.assertEquals(test,doubleQueue.poll());
    }

    /**
     *  it returns null if  is empty.
     */
    @Test
    public void testPollB(){
        Assertions.assertNull(doubleQueue.poll());
    }

    /**
     * if removed from an empty list an exception is thrown
     */
    @Test
    public void testRemoveA(){
        assertThrows(NoSuchElementException.class, () -> doubleQueue.remove());
    }


    /**
     *  if it removes the first added element by comparing assertions
     */
    @Test
    public void testRemoveB(){
        double test = 30.2;
        double test2 = 0.2;
        doubleQueue.offer(test);
        doubleQueue.offer(test2);
        Assertions.assertEquals(test,doubleQueue.remove());
    }



    /**
     *  if it gets the first element
     */
    @Test
    public void testPeekA(){
        double test = 30.2;
        double test2 = 0.2;
        doubleQueue.offer(test);
        doubleQueue.offer(test2);
        Assertions.assertEquals(test,doubleQueue.peek());
    }

    /**
     *  returns null if the list empty
     */
    @Test
    public void testPeekB(){
        Assertions.assertNull(doubleQueue.peek());
    }





    /**
     * checks if it peeks the first added element
     */
    @Test
    public void testElementA(){
        double test = 30.2;
        double test2 = 0.2;
        doubleQueue.offer(test);
        doubleQueue.offer(test2);
        Assertions.assertEquals(test,doubleQueue.element());
    }

    /**
     * if the list is empty , throws an exception
     */
    @Test
    public void testElementB(){
        assertThrows(NoSuchElementException.class, () -> doubleQueue.element());
    }

}