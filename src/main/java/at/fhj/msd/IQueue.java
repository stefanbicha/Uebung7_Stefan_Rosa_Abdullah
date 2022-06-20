package at.fhj.msd;

/**
 * Interface IQueue to apply in multiple classes
 */

public interface IQueue {
  /**
   * add object to queue, return true if works, otherwise false
   * @param obj String,Drink or Double
   * @return true if an object was added; false if  not
   */
  public abstract boolean offer(Object obj);

  /**
   * deletes first element null if no element in there
   * @return polled object
   */
  public abstract Object poll();

  /**
   * like poll but if no elment exists NoSuchElementException is throwin instead of null return value
   * @return removed object
   */
  public abstract Object remove();

  /**
   * gives first element but does not delete, null if nothing there
   * @return peeked object
   */
  public abstract Object peek();

  /**
   * like peek but NoSuchElementException instead of null
   * @return element object
   */
  public abstract Object element();
}