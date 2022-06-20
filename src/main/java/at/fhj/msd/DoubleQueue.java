package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * represents a list of double objects
 * @author  Abdullah Kaiouta,Rosa Dennig, Stefan Bicha
 */
public class DoubleQueue implements IQueue {

    /**
     * queue of double numbers
     */
    private List<Double> elements = new ArrayList<>();
    /**
     *Queue size
     */
    private int maxSize;

    /**
     * constructor of doubleQueue
     * @param maxSize Queue size
     */
    public DoubleQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * adds a double to the list
     * @param obj the double
     * @return true when a double ob was added otherwise false
     */
    @Override
    public boolean offer(Object obj) {
        if (elements.size() != maxSize)
            elements.add((Double) obj);
        else
            return false;

        return true;
    }

    /**
     * gets the first double on the list and removes it
     * @return the first double if exists
     */
    @Override
    public Object poll() {
        Object element = peek();

        if (elements.size() > 0) {
            elements.remove(element);
        }

        return element;
    }


    /**
     * deletes double, but if no double throws NoSuchElementException
     */
    @Override
    public Object remove() {
        Object element = poll();

        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    /**
     * gives first double but does not delete
     * @return null if there is no double otherwise returns double
     */
    @Override
    public Object peek() {
        Object element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    /**
     * gives first double but does not delete
     * @return throws NoSuchElementException if there is no double otherwise returns double
     */
    @Override
    public Object element() {
        Object element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

}