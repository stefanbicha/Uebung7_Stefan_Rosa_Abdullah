package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * represents a menu of strings
 * @author  Abdullah Kaiouta,Rosa Dennig, Stefan Bicha
 */
public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize;//deleted the standard value 5

  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * adds a string to the list
   * @param obj a string
   * @return true when a string was added otherwise false
   * @author Rosa Dennig
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
   * @ Author Rosa Dennig
   */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() > 0) {//==  --> >
      elements.remove(element);
    }
    return element;
  }

  @Override
  public String remove() {
    String element = poll();
    //element = "";   auskommentiert
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}