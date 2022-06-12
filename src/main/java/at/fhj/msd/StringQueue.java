package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize;//deleted the standard value 5

  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  @Override
  public boolean offer(Object obj) {
    if (elements.size() != maxSize)
      elements.add((String) obj);
    else
      return false;

    return true;
  }

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