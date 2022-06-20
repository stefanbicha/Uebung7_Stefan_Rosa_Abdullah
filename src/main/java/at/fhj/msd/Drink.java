package at.fhj.msd;

/**
 * Abstract base class for concrete drink classes
 */
public abstract class Drink {
    /**
     * name of the drink
     */
    protected String name;
    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     *
     */
    public Drink(String name) {
        this.name = name;
    }
    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    public abstract double getVolume();
    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public abstract double getAlcoholPercent();
    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    public abstract boolean isAlcoholic();


    /**
     * getter
     * @return name of the Drink
     */
    public String getName() {
        return name;
    }

    /**
     * setter
     * sets new name
     * @param name to be changed
     */
    public void setName(String name) {
        this.name = name;
    }
}
