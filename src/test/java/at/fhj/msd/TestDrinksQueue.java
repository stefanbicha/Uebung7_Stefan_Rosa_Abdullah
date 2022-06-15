package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * tests the StringQueue class
 * @author Stefan Bicha
 */
public class TestDrinksQueue {
    private DrinksQueue drinksQueue;

    /**
     * creates a new object of DrinksQueue (maxSize = 2) before each test case
     * */
    @BeforeEach
    public void setUp(){
        drinksQueue = new DrinksQueue(2);
    }


    /**
     * it returns true if a String was given as parameter to add
     */
    @Test
    public void testOfferA(){
        Drink test = new SimpleDrink("test Drink A",new Liquid("wodka",30.8,30.2));
        drinksQueue.offer(test);
        Assertions.assertTrue(drinksQueue.offer(test));
    }

    /**
     * it returns false if the list is full because added 1 more Object
     */
    @Test
    public void testOfferB(){
        Drink test = new SimpleDrink("test Drink A",new Liquid("wodka",30.8,30.2));
        Drink test2 = new SimpleDrink("test Drink B",new Liquid("Tequilla",36.6,29));
        drinksQueue.offer(test);
        drinksQueue.offer(test2);
        Assertions.assertFalse(drinksQueue.offer(test));
    }


    /**
     * checks poll methods when it is not empty by comparing the result after adding and then calling the method poll
     * it polls the first added element then the assertion works
     */
    @Test
    public void testPollA(){
        Drink test = new SimpleDrink("test Drink A",new Liquid("wodka",30.8,30.2));
        Drink test2 = new SimpleDrink("test Drink B",new Liquid("Tequilla",36.6,29));
        drinksQueue.offer(test);
        drinksQueue.offer(test2);
        Assertions.assertEquals(test,drinksQueue.poll());
    }

    /**
     *  it returns null if  is empty.
     */
    @Test
    public void testPollB(){
        Assertions.assertNull(drinksQueue.poll());
    }

    /**
     * if remove from an empty list an exception is thrown
     */
    @Test
    public void testRemoveA(){
        assertThrows(NoSuchElementException.class, () -> drinksQueue.remove());
    }


    /**
     *  if it removes the first added element by comparing assertions
     */
    @Test
    public void testRemoveB(){
        Drink test = new SimpleDrink("test Drink A",new Liquid("wodka",30.8,30.2));
        Drink test2 = new SimpleDrink("test Drink B",new Liquid("Tequilla",36.6,29));
        drinksQueue.offer(test);
        drinksQueue.offer(test2);
        Assertions.assertEquals(test,drinksQueue.remove());
    }



    /**
     *  if it gets the first element
     */
    @Test
    public void testPeekA(){
        Drink test = new SimpleDrink("test Drink A",new Liquid("wodka",30.8,30.2));
        Drink test2 = new SimpleDrink("test Drink B",new Liquid("Tequilla",36.6,29));
        drinksQueue.offer(test);
        drinksQueue.offer(test2);
        Assertions.assertEquals(test,drinksQueue.peek());
    }

    /**
     *  returns null if the list empty
     */
    @Test
    public void testPeekB(){
        Assertions.assertNull(drinksQueue.peek());
    }





    /**
     * checks if it peeks the first added element
     */
    @Test
    public void testElementA(){
        Drink test = new SimpleDrink("test Drink A",new Liquid("wodka",30.8,30.2));
        Drink test2 = new SimpleDrink("test Drink B",new Liquid("Tequilla",36.6,29));
        drinksQueue.offer(test);
        drinksQueue.offer(test2);
        Assertions.assertEquals(test,drinksQueue.element());
    }

    /**
     * if the list is empty , throws an exception
     */
    @Test
    public void testElementB(){
        assertThrows(NoSuchElementException.class, () -> drinksQueue.element());
    }

}
