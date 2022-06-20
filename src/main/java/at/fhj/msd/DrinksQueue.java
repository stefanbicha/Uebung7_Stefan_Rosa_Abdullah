package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


/**
 * represents a menu of drinks
 * @author  Abdullah Kaiouta,Rosa Dennig, Stefan Bicha
 */
public class DrinksQueue implements IQueue {
  /**
   * list of DrinkQueue
   */
  private List<Drink> drinks = new ArrayList<>();
  /**
   * DrinkQueue size
   */
  private int maxSize;

  /**
   * constructor of DrinkQueue
   * @param maxSize Queue size
   */
  public DrinksQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * adds a drink to the menu
   * @param obj the drink
   * @return true when a drink was added otherwise false
   */
  @Override
  public boolean offer(Object obj) {
    if (drinks.size() != maxSize)
      drinks.add((SimpleDrink) obj);
    else
      return false;

    return true;
  }

  /**
   * gets the first drink on the list and removes it
   * @return the first drink if exists
   */
  @Override
  public Object poll() {
    Object element = peek();

    if (drinks.size() > 0) {
      drinks.remove(element);
    }

    return element;
  }


  /**
   * deletes object, but if no object throws NoSuchElementException
   */
  @Override
  public Object remove() {
    Object element = poll();

    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * gives first Object but does not delete
   * @return null if there is no object otherwise returns object
   */
  @Override
  public Object peek() {
    Object element;
    if (drinks.size() > 0)
      element = drinks.get(0);
    else
      element = null;

    return element;
  }

  /**
   * gives first object but does not delete
   * @return throws NoSuchElementException if there is no object otherwise returns object
   */
  @Override
  public Object element() {
    Object element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}