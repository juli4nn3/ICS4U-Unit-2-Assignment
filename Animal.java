/**
 * This superclass uses private variables with public getters/setter methods
 * and abstract methods to determine properties and actions of different types
 * of animals inherited from each object's subclass.
 * @author Julianne Leblanc-Peltier
 * @version 1.0
 * @since December 1, 2025
 */
abstract class Animal {
    /**
     * This variable is for the colour value of the animal.
     */
    private String colour;

    /**
     * This variable is for the name value of the animal.
     */
    private String name;

    /**
     * This variable is for the species value of the animal.
     */
    private String species;

    /**
     * This variable is for the special ability value of the animal.
     */
    private String specialAbility;

    /**
     * This variable is for the max speed value of the animal.
     */
    private int maxSpeed;

    /**
     * This variable is for the current speed value of the animal.
     */
    private int speed;

    /**
     * This is a constructor for the Animal which sets default values.
     * @param animalName
     * @param animalSpecies
     * @param animalColour
     * @param animalSpecialAbility
     * @param animalMaxSpeed
     */
    Animal(final String animalName, final String animalSpecies,
    final String animalColour, final String animalSpecialAbility,
    final int animalMaxSpeed) {
        name = animalName;
        species = animalSpecies;
        colour = animalColour;
        specialAbility = animalSpecialAbility;
        maxSpeed = animalMaxSpeed;
        speed = 0;
    }

    /**
     * This is a method which prints the status of each variable for animal.
     */
    public void status() {
        System.out.print("\n --> Name: " + name);
        System.out.print("\n --> Species: " + species);
        System.out.print("\n --> Colour: " + colour);
        System.out.print("\n --> Special Ability: " + specialAbility);
        System.out.print("\n --> Max Speed: " + maxSpeed);
        System.out.print("\n --> Speed: " + speed + "\n");
    }

    /**
     * This is an abstract method which can be initiated in a subclass.
     */
    public abstract void specialAbility();

    /**
     * This is an abstract method which can be initiated in a subclass.
     * This method calculates new speed after acceleration.
     * @param power
     * @param time
     */
    abstract void accelerate(int power, int time);

    /**
     * This is an abstract method which can be initiated in a subclass.
     * This method calculates new speed after brake.
     * @param power
     * @param time
     */
    abstract void brake(int power, int time);

    /**
     * This method sets new value to max speed variable.
     * @param newAnimalMaxSpeed
     */
    public void setMaxSpeed(final int newAnimalMaxSpeed) {
        maxSpeed = newAnimalMaxSpeed;
    }

    /**
     * This method returns current max speed.
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * This method sets new value to animal speed.
     * @param newAnimalSpeed
     */
    public void setSpeed(final int newAnimalSpeed) {
        speed = newAnimalSpeed;
    }

    /**
     * This method returns current speed.
     * @return speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * This method sets new value to colour variabe.
     * @param newAnimalColour
     */
    public void setColour(final String newAnimalColour) {
        colour = newAnimalColour;
    }

    /**
     * This method returns the current value of colour variable.
     * @return colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * This method sets new value to name variable.
     * @param newAnimalName
     */
    public void setName(final String newAnimalName) {
        name = newAnimalName;
    }

    /**
     * This method returns the current value of name variable.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets new value to species variable.
     * @param newAnimalSpecies
     */
    public void setSpecies(final String newAnimalSpecies) {
        species = newAnimalSpecies;
    }

    /**
     * This method returns the current value of species variable.
     * @return species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * This method sets new value to specialAbility variable.
     * @param newAnimalSpecialAbility
     */
    public void setSpecialAbility(final String newAnimalSpecialAbility) {
        specialAbility = newAnimalSpecialAbility;
    }

    /**
     * This method returns the current value of specialAbility variable.
     * @return specialAbility
     */
    public String getSpecialAbility() {
        return specialAbility;
    }
}
