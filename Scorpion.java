/**
 * This class defines the scorpion subclass for the Animal superclass.
 * It defines the actions and characteristics of the scorpion character
 * within the main file story.
 * 
 * @author Julianne Leblanc-Peltier
 * @version 1.0
 * @since December 1, 2025
 */
public class Scorpion extends Animal {
    /**
     * This variable is for the speed value of the scorpion.
     */
    private int scorpionSpeed;

    /**
     * This is the constructor for the scorpion class.
     * @param scorpionName
     * @param scorpionSpecies
     * @param scorpionColour
     * @param scorpionSpecialAbility
     * @param scorpionMaxSpeed
     */
    public Scorpion(final String scorpionName, final String scorpionSpecies,
    final String scorpionColour, final String scorpionSpecialAbility,
    final int scorpionMaxSpeed) {
        super(scorpionName, scorpionSpecies, scorpionColour,
        scorpionSpecialAbility, scorpionMaxSpeed);
    }

    /**
     * This method polymorphs the abstract superclass.
     */
    public void specialAbility() {
        int zeroConst = 0;
        System.out.print(super.getName() + " uses Special Ability: ");
        System.out.println(super.getSpecialAbility());

        System.out.println("""
        \nThis ability stings the closest object to the scorpion, forcing the
        object to stop. However, forces the scorpion to stop too!
        """);

        super.setSpeed(zeroConst);
        System.out.println("New Speed: " + super.getSpeed());
    }

    /**
     * This method calculates new speed after acceleration.
     * @param tarsalPower
     * @param time
     */
    public void accelerate(final int tarsalPower,
    final int time) {
        scorpionSpeed = super.getSpeed();
        if ((scorpionSpeed + (tarsalPower * time)) > super.getMaxSpeed()) {
            scorpionSpeed = super.getMaxSpeed();
        } else {
            scorpionSpeed += (tarsalPower * time);
        }

        super.setSpeed(scorpionSpeed);
    }

    /**
     * this method calculates new speed after brake.
     * @param breakPower
     * @param breakTime
     */
    public void brake(final int breakPower, final int breakTime) {
        scorpionSpeed = super.getSpeed();
        if (scorpionSpeed - (breakPower * breakTime) < 0) {
            scorpionSpeed = 0;
        } else {
            scorpionSpeed = scorpionSpeed - (breakPower * breakTime);
        }

        super.setSpeed(scorpionSpeed);
    }
}
