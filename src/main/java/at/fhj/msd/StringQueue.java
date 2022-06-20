package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * represents a list of strings
 * @author  Abdullah Kaiouta,Rosa Dennig, Stefan Bicha
 */
public class StringQueue implements IQueue {

  /**
   * list of StringQueue
   */
  private List<String> elements = new ArrayList<String>();
  /**
   * StringQueue size
   */
  private int maxSize;//deleted the standard value 5

  /**
   * constructor of StringQueue
   * @param maxSize Queue size
   */
  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * adds a string to the list
   * @param obj a string
   * @return true when a string was added otherwise false
   */
  @Override
  public boolean offer(Object obj) {
    if (elements.size() != maxSize)
      elements.add((String) obj);
    else
      return false;

    return true;
  }


  /**
   * gets the first string of the list and removes it
   * @return the first string if it exists
   */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() > 0) {//==  --> >
      elements.remove(element);
    }
    return element;
  }
  /**
   * deletes string, but if there is no string throws NoSuchElementException
   */
  @Override
  public String remove() {
    String element = poll();
    //element = "";   auskommentiert
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * gives first string but does not delete
   * @return null if there is no string otherwise returns string
   */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }
  /**
   * gives first string but does not delete
   * @return throws NoSuchElementException if there is no string otherwise returns string
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}