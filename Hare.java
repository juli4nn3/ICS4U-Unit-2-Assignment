/**
 * This class defines the Hare subclass for the Animal superclass.
 * It defines the actions and characteristics of the hare character
 * within the main file story.
 * 
 * @author Julianne Leblanc-Peltier
 * @version 1.0
 * @since December 1, 2025
 */
public class Hare extends Animal {
    /**
     * This variable is for the speed value of the Hare.
     */
    private int hareSpeed;

    /**
     * This is the constructor for the Hare class.
     * @param hareName
     * @param hareSpecies
     * @param hareColour
     * @param hareSpecialAbility
     * @param hareMaxSpeed
     */
    public Hare(final String hareName, final String hareSpecies,
    final String hareColour, final String hareSpecialAbility,
    final int hareMaxSpeed) {
        super(hareName, hareSpecies, hareColour,
        hareSpecialAbility, hareMaxSpeed);
    }

    /**
     * This method polymorphs the abstract superclass.
     */
    public void specialAbility() {
        int zeroConst = 0;
        System.out.print(super.getName() + " uses Special Ability: ");
        System.out.println(super.getSpecialAbility());

        System.out.println("""
        \nThis ability slightly increases the Hare's speed by 5% and taunts
        the closest object to it by showing off its Sailor Moon outfit!
        The taunt effect dampens the closest objects speed by 10%!
        """);

        super.setSpeed(zeroConst);
        System.out.println("New Speed: " + super.getSpeed());
    }

    /**
     * This method calculates new speed after acceleration.
     * @param hindPawPower
     * @param hareTime
     */
    public void accelerate(final int hindPawPower,
    final int hareTime) {
        hareSpeed = super.getSpeed();
        if ((hareSpeed + (hindPawPower * hareTime)) > super.getMaxSpeed()) {
            hareSpeed = super.getMaxSpeed();
        } else {
            hareSpeed += (hindPawPower * hareTime);
        }

        super.setSpeed(hareSpeed);
    }

    /**
     * this method calculates new speed after brake.
     * @param breakPower
     * @param breakTime
     */
    public void brake(final int breakPower, final int breakTime) {
        hareSpeed = super.getSpeed();
        if (hareSpeed - (breakPower * breakTime) < 0) {
            hareSpeed = 0;
        } else {
            hareSpeed = hareSpeed - (breakPower * breakTime);
        }

        super.setSpeed(hareSpeed);
    }
}
