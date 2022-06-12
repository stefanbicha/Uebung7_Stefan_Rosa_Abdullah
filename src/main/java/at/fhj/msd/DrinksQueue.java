package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


/**
 * represents a menu of drinks
 * @author  Abdullah Kaiouta,Rosa Dennig, Stefan Bicha
 */
public class DrinksQueue implements IQueue {

  private List<Drink> drinks = new ArrayList();
  private int maxSize;

  public DrinksQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * adds a drink to the menu
   * @param obj the drink
   * @return true when a drink was added otherwise false
   * @author Abdullah Kaitoua
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
   * @ Author Abdullah Kaitoua
   */
  @Override
  public Object poll() {
    Object element = peek();

    if (drinks.size() > 0) {
      drinks.remove(element);
    }

    return element;
  }

  @Override
  public Object remove() {
    Object element = poll();

    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  @Override
  public Object peek() {
    Object element;
    if (drinks.size() > 0)
      element = drinks.get(0);
    else
      element = null;

    return element;
  }

  @Override
  public Object element() {
    Object element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}