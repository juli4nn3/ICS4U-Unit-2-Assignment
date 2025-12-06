/**
 * This class defines the Tortoise subclass for the Animal superclass.
 * It defines the actions and characteristics of the hare character
 * within the main file story.
 * 
 * @author Julianne Leblanc-Peltier
 * @version 1.0
 * @since December 1, 2025
 */
public final class Tortoise extends Animal {
    /**
     * This variable is for the speed value of the Tortoise.
     */
    private int tortoiseSpeed;

    /**
     * This is the constructor for the Tortoise class.
     * @param tortoiseName
     * @param tortoiseSpecies
     * @param tortoiseColour
     * @param tortoiseSpecialAbility
     * @param tortoiseMaxSpeed
     */
    public Tortoise(final String tortoiseName, final String tortoiseSpecies,
    final String tortoiseColour, final String tortoiseSpecialAbility,
    final int tortoiseMaxSpeed) {
        super(tortoiseName, tortoiseSpecies, tortoiseColour,
        tortoiseSpecialAbility, tortoiseMaxSpeed);
    }

    /**
     * This method polymorphs the abstract superclass.
     */
    public void specialAbility() {
        int fourtyConst = 40;
        System.out.print(super.getName() + " uses Special Ability: ");
        System.out.println(super.getSpecialAbility());

        System.out.println("""
        \nThis ability allows the tortoise to increase
        it's max speed to 40 km/h and forces all other objects to stop,
        trapping them in the tortoise' domain!
        """);

        super.setMaxSpeed(fourtyConst);
        System.out.println("New Max Speed: " + super.getMaxSpeed());

    }

    /**
     * This method calculates new speed after acceleration.
     * @param finPower
     * @param tortoiseTime
     */
    public void accelerate(final int finPower, final int tortoiseTime) {
        tortoiseSpeed = super.getSpeed();
        if ((tortoiseSpeed + (finPower * tortoiseTime)) > super.getMaxSpeed()) {
            tortoiseSpeed = super.getMaxSpeed();
        } else {
            tortoiseSpeed += (finPower * tortoiseTime);
        }

        super.setSpeed(tortoiseSpeed);
    }

    /**
     * this method calculates new speed after brake.
     * @param breakPower
     * @param breakTime
     */
    public void brake(final int breakPower, final int breakTime) {
        tortoiseSpeed = super.getSpeed();
        if (tortoiseSpeed - (breakPower * breakTime) < 0) {
            tortoiseSpeed = 0;
        } else {
            tortoiseSpeed = tortoiseSpeed - (breakPower * breakTime);
        }

        super.setSpeed(tortoiseSpeed);
    }
}
